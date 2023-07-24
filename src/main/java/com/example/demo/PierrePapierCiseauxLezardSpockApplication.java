package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.services.Game;

@SpringBootApplication
public class PierrePapierCiseauxLezardSpockApplication {

	public static void main(String[] args) {
		SpringApplication.run(PierrePapierCiseauxLezardSpockApplication.class, args);
		Game game= new Game();
		game.runGame();
	}

}
