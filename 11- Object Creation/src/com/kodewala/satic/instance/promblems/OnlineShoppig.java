package com.kodewala.satic.instance.promblems;

public class OnlineShoppig {
	static {
		System.out.println("Shoping App Initialize");
	}
	{
		System.out.println("Creating shopping session");
	}
	OnlineShoppig(){
		System.out.println("User Logged In");
	}

}
class OnlineDriver{
	public static void main(String[] args) {
		OnlineShoppig o = new OnlineShoppig();
		OnlineShoppig n = new OnlineShoppig();
		OnlineShoppig i = new OnlineShoppig();
	}
}
