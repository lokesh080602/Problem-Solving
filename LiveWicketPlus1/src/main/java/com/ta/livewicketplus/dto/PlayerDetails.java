package com.ta.livewicketplus.dto;

import javax.persistence.*;

@Entity
public class PlayerDetails {

	    public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long playerDetailsId;

	    private String name;
	    private int age;
	    private String nationality;
	    private String team;
	    private String role;
	    private String battingStyle;
	    private String bowlingStyle;
	    private String currentMatchStatus;

	    @ManyToOne
	    @JoinColumn(name = "match_id") // This is the foreign key column
	    private Match match;
    // Default constructor
    public PlayerDetails() {
    }

    // Constructor with all required fields
    public PlayerDetails(String name, int age, String nationality, String team, String role, 
                         String battingStyle, String bowlingStyle, String currentMatchStatus) {
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.team = team;
        this.role = role;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.currentMatchStatus = currentMatchStatus;
    }

    // Getters and setters
    public Long getPlayerDetailsId() {
        return playerDetailsId;
    }

    public void setPlayerDetailsId(Long playerDetailsId) {
        this.playerDetailsId = playerDetailsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getBattingStyle() {
        return battingStyle;
    }

    public void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    public String getBowlingStyle() {
        return bowlingStyle;
    }

    public void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    public String getCurrentMatchStatus() {
        return currentMatchStatus;
    }

    public void setCurrentMatchStatus(String currentMatchStatus) {
        this.currentMatchStatus = currentMatchStatus;
    }
}
