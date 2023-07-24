package com.example.demo.services;

import com.example.demo.model.Players;

public class Scores {
	
	private final Players players;
	
	public Scores (Players players) {
		this.players = players;
	}
	
	public String result(int playerScore, int computerScore) {
		
		playerScore = players.getPlayerScore();
		computerScore = players.getComputerScore();
		
		if(playerScore == 3) {
			return "Bravo vous avez gagné !";
		} else if(computerScore == 3) {
			return "Vous avez perdu, désolé !";
		} else return "Manche suivante";
	}
}
