package com.kodewala.oops.overloading;

public class Game {
	  void start() {
	        System.out.println("Game started");
	    }
	}

	class CricketGame extends Game {
		@Override
	    void start() {
	        System.out.println("Cricket started");
	    }

	    void showScore() {  // Method exits in CricketGame not in a game class
	        System.out.println("Score displayed");
	    }
	    public static void main(String[] args) {
	    	Game g = new CricketGame();
	    	g.start();
//	    	g.showScore(); method exists only in CricketGame, not in the Game class.
		}
	}


