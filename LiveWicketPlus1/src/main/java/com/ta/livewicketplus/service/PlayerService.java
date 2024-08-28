package com.ta.livewicketplus.service;

import com.ta.livewicketplus.dao.PlayerDetailsDAO;
import com.ta.livewicketplus.dto.PlayerDetails;

public class PlayerService {

    private PlayerDetailsDAO playerDetailsDAO = new PlayerDetailsDAO();

    public PlayerDetails getPlayerDetails(int id) {
        return playerDetailsDAO.findById(id);
    }

    public void addPlayerDetails(PlayerDetails playerDetails) {
        playerDetailsDAO.save(playerDetails);
    }
    
    public void updatePlayerDetails(PlayerDetails playerDetails) {
        playerDetailsDAO.update(playerDetails);
    }
    
    public void deletePlayerDetails(Long id) {
        playerDetailsDAO.delete(id);
    }
}
