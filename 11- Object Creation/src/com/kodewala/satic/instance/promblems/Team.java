package com.kodewala.satic.instance.promblems;

public class Team {
	static {
		System.out.println("Team 1");
	}
	static {
		System.out.println("Team 2");
	}

}
class Manager extends Team {
	static {
		System.out.println("Manager 1");
		
	}
	static {
		System.out.println("Manager");
	}
	public static void main(String[] args) {
		Manager m = new Manager();
		Manager m1 = new Manager();
	}
}
