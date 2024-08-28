package com.ta.livewicketplus.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import org.apache.logging.log4j.*;
import com.ta.livewicketplus.dto.PlayerDetails;
import com.ta.livewicketplus.service.PlayerService;


@WebServlet("/PlayerServlet")
public class PlayerDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger logger = LogManager.getLogger(PlayerDetailsServlet.class);
	private PlayerService playerservice = new PlayerService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idParam = request.getParameter("id");
		if (idParam != null && !idParam.isEmpty()) {
			try {
				int id = Integer.parseInt(idParam);
				PlayerDetails player = playerservice.getPlayerDetails(id);
				request.setAttribute("player", player);

				RequestDispatcher dispatcher = request.getRequestDispatcher("playerDetails.jsp");
				dispatcher.forward(request, response);
			} catch (NumberFormatException e) {
				logger.error("Invalid player ID format: {}", idParam, e);
				request.setAttribute("error", "Invalid player ID format.");
				RequestDispatcher dispatcher = request.getRequestDispatcher("listPlayers.jsp");
				dispatcher.forward(request, response);
			}
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("listPlayers.jsp");
			dispatcher.forward(request, response);
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		logger.info("Action received: {}", action);

		if ("add".equals(action)) {
			try {
				PlayerDetails player = new PlayerDetails();
				player.setName(request.getParameter("name"));
				player.setAge(Integer.parseInt(request.getParameter("age")));
				player.setNationality(request.getParameter("nationality"));
				player.setTeam(request.getParameter("team"));
				player.setRole(request.getParameter("role"));
				player.setBattingStyle(request.getParameter("battingStyle"));
				player.setBowlingStyle(request.getParameter("bowlingStyle"));
				player.setCurrentMatchStatus(request.getParameter("currentMatchStatus"));
				logger.info("Adding player: {}", player.getName());
				playerservice.addPlayerDetails(player);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/playerList.jsp");
				dispatcher.forward(request, response);
			} catch (NumberFormatException e) {
				logger.error("Invalid input format", e);
				request.setAttribute("error", "Invalid input format. Please check your data.");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/listPlayers.jsp");
				dispatcher.forward(request, response);
			}
		} else {
			logger.warn("Action not executed: {}", action);
		}
	}
}
