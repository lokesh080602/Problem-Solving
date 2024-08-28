package com.ta.livewicketplus.dto;

import javax.persistence.*;
import java.util.*;
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    
    private String username;
    private String password;
    private String email;

    @ElementCollection
    private List<String> favoriteTeams;

    @ElementCollection
    private List<String> favoritePlayers;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getFavoriteTeams() {
		return favoriteTeams;
	}

	public void setFavoriteTeams(List<String> favoriteTeams) {
		this.favoriteTeams = favoriteTeams;
	}

	public List<String> getFavoritePlayers() {
		return favoritePlayers;
	}

	public void setFavoritePlayers(List<String> favoritePlayers) {
		this.favoritePlayers = favoritePlayers;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
    
}
