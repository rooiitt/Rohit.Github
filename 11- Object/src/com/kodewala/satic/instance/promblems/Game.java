package com.kodewala.satic.instance.promblems;

public class Game {
	static int count = 0;
	{
		System.out.println("Game Started");
	}
	{
		count++;
	}
	Game(){
		System.out.println(count);
	
	}
	public static void main(String[] args) {
		Game g1 = new Game();
		Game g2 = new Game();
		Game g3 = new Game();
		
	}

}
