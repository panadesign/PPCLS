package com.example.demo.model;

public class Players {

	private String playerName = "Humain";
	private String computerName = "Robot";
	
	private int playerScore = 0;
	private int computerScore = 0;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getComputerName() {
		return computerName;
	}
	public void setComputerName(String computerName) {
		this.computerName = computerName;
	}
	public int getPlayerScore() {
		return playerScore;
	}
	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	public int getComputerScore() {
		return computerScore;
	}
	public void setComputerScore(int computerScore) {
		this.computerScore = computerScore;
	}
	
	public Players(String playerName, String computerName, int playerScore, int computerScore) {
		super();
		this.playerName = playerName;
		this.computerName = computerName;
		this.playerScore = playerScore;
		this.computerScore = computerScore;
	}
	
	public Players() {
	}
	
}
