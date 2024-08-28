package com.ta.livewicketplus.dto;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matchId;

    private String teamA;
    private String teamB;
    private int scoreTeamA;
    private int scoreTeamB;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlayerDetails> playerDetailsList;


	public Long getMatchId() {
		return matchId;
	}

	public void setMatchId(Long matchId) {
		this.matchId = matchId;
	}

	public String getTeamA() {
		return teamA;
	}

	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}

	public String getTeamB() {
		return teamB;
	}

	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}

	public Integer getScoreTeamA() {
		return scoreTeamA;
	}

	public void setScoreTeamA(Integer scoreTeamA) {
		this.scoreTeamA = scoreTeamA;
	}

	public Integer getScoreTeamB() {
		return scoreTeamB;
	}

	public void setScoreTeamB(Integer scoreTeamB) {
		this.scoreTeamB = scoreTeamB;
	}

	public List<PlayerDetails> getPlayersDetials() {
		return playerDetailsList;
	}

	public void setPlayersDetials(List<PlayerDetails> playersDetials) {
		this.playerDetailsList = playersDetials;
	}

	public Match() {
		super();
	}

	public Match(Long matchId, String teamA, String teamB, Integer scoreTeamA, Integer scoreTeamB,
			List<PlayerDetails> playersDetials) {
		super();
		this.matchId = matchId;
		this.teamA = teamA;
		this.teamB = teamB;
		this.scoreTeamA = scoreTeamA;
		this.scoreTeamB = scoreTeamB;
		this.playerDetailsList = playersDetials;
	}

    // Default constructor
   
}
