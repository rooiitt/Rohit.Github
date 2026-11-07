package com.oops.quetions.encapsulation2;

//Password Management
public class User {
	private String passward;

	public void setPassward(String passward) {
		if (passward != null && passward.length() >= 8) { // length is >=8
			this.passward = passward;
			System.out.println("Passward updated successfully");
		} else {
			System.out.println("Passward must contain at least 8 charecter");
		}
	}

	public String getPassward() {
		return passward;
	}

	public static void main(String[] args) {
		User u = new User();
		u.setPassward("Manasvi@2508");
		u.setPassward("Rohit@123");
	}

}
