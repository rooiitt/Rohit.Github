package com.oops.quetions.encapsulation2;
//Candidate registered
class Candidate {
	private String candidateName;
	private int marks;
	private boolean registered;

	public Candidate(String candidateName, int marks) {
		this.candidateName = candidateName;
		this.marks = marks;
		this.registered = false;
	}

	public boolean isRegistered() {
		return registered;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void register() {
		if (candidateName != null && !candidateName.isEmpty() && marks >= 0 && marks <= 100) {
			registered = true;
			System.out.println("Candidate registered successfully.");
		} else {
			System.out.println("Invalid candidate details. Registration failed.");
		}
	}
}

class DriverCandidate {
	public static void main(String[] args) {
		Candidate c = new Candidate("Anudeep", 85);

		c.register();
		System.out.println("Registration status: " + c.isRegistered());
	}
}