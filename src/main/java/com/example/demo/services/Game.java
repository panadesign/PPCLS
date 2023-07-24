package com.example.demo.services;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	public void runGame() {
		result();
	}
	
	Scanner sc = new Scanner(System.in);

	String[] moves = {"pierre", "papier", "ciseaux", "lezard", "spock"};
	
	private String playerChoice() {
		System.out.println("Bienvenue dans le jeu Pierre Papier Ciseaux Lezard Spock");

		System.out.println("Tapez votre choix : pierre, papier, ciseaux, lezard, spock");
		
		
		List<String> moveList = Arrays.asList(moves);	

		String playerChoice = sc.next().toLowerCase();
		
		while(!moveList.contains(playerChoice)) {
			System.out.println("Votre choix est incorrect, resaisissez un choix valide");
			playerChoice = sc.next().toLowerCase();
		}

		System.out.println("Vous avez choisi : " + playerChoice);

		return playerChoice;
	}
	
	private String computerChoice() {
		Random random = new Random();
		String computerChoice = moves[random.nextInt(moves.length)];
		
		System.out.println("L'ordinateur a choisi : " + computerChoice);
		
		return computerChoice;
	}
	
	private void result() {
		
		String win = "Bravo, tu as gagne";
		String lose = "Aie ! C'est perdu.";
		String draw = "Egalite !";
		
		String playerMove = playerChoice();
		String computerMove = computerChoice();
		
		if (("pierre".equals(playerMove) && "ciseaux".equals(computerMove)) || ("pierre".equals(playerMove) && "lezard".equals(computerMove))) {
			System.out.println(win);
		} else if (("papier".equals(playerMove) && "pierre".equals(computerMove)) || ("papier".equals(playerMove) && "spock".equals(computerMove))) {
			System.out.println(win);
		} else if (("ciseaux".equals(playerMove) && "papier".equals(computerMove)) || ("ciseaux".equals(playerMove) && "lezard".equals(computerMove))) {
			System.out.println(win);
		} else if (("lezard".equals(playerMove) && "spock".equals(computerMove)) || ("lezard".equals(playerMove) && "papier".equals(computerMove))) {
			System.out.println(win);
		} else if (("spock".equals(playerMove) && "ciseaux".equals(computerMove)) || ("spock".equals(playerMove) && "pierre".equals(computerMove))) {
			System.out.println(win);
		} else if (Objects.equals(playerMove, computerMove)) {
			System.out.println(draw);
		} else System.out.println(lose);
		
		replay();
	}
	
	private void replay() {
		System.out.println("On rejoue ? (oui ou non)");
		String response = sc.next().toLowerCase();
		
		if ("oui".equals(response)) {
			result();
		} else System.out.println("La partie est terminee !");
		
		sc.close();
	}

}
