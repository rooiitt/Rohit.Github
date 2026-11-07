package com.kodewala.satic.instance.promblems;

public class GamingConsole {
	static {
		System.out.println("Console Setup"); // Static
	}
	{
		System.out.println("Loading Game"); // Instance
	}
	GamingConsole(){
		System.out.println("Game Ready"); // Constructor
	}

}
class GmaingDriver{
	public static void main(String[] args) {
		GamingConsole g = new GamingConsole();
		GamingConsole a = new GamingConsole();
		
	}
}
