package com.ta.livewicketplus.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ta.livewicketplus.service.MatchService;

@WebServlet("/MatchServlet")
public class MatchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private MatchService matchService;

	@Override
	public void init() throws ServletException {
		super.init();
		matchService = new MatchService();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String matchId = request.getParameter("matchId");

		if (matchId != null) {
			int id = Integer.parseInt(matchId);
			String matchDetails = matchService.getMatchDetails(id);
			response.getWriter().write(matchDetails);
		} else {
			response.getWriter().write("Match ID is required!");
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}
	@Override
	public void destroy() {
		super.destroy();
	}
}
