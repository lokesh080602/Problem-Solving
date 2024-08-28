package com.ta.livewicketplus.service;

import com.ta.livewicketplus.dao.MatchDAO;
import com.ta.livewicketplus.dto.Match;

import java.util.List;

public class MatchService {

    private MatchDAO matchDAO;

    public MatchService() {
        matchDAO = new MatchDAO(); // Instantiate DAO class
    }

    // Example method to get match details by ID
    public String getMatchDetails(int matchId) {
        Match match = matchDAO.getMatchById(matchId);
        if (match != null) {
            return "Match ID: " + match.getMatchId() + ", Teams: " + match.getTeamA() + " vs " + match.getTeamB() +
                   ", Score: " + match.getScoreTeamA() + "-" + match.getScoreTeamB();
        } else {
            return "No match found with ID: " + matchId;
        }
    }

    // Method to save a match
    public void saveMatch(Match match) {
        matchDAO.saveMatch(match);
    }

    // Method to update an existing match
    public void updateMatch(Match match) {
        matchDAO.updateMatch(match);
    }

    // Method to delete a match by ID
    public void deleteMatch(int matchId) {
        matchDAO.deleteMatch(matchId);
    }

    // Method to get all matches
    public List<Match> getAllMatches() {
        return matchDAO.getAllMatches();
    }

    // Method to get the count of matches
    public long getMatchCount() {
        return getAllMatches().size();
    }
}

