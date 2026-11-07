package com.kodewala.interfacetype.functionalinterface;

/*
 * () Parameters of the abstract method & -> Lambda Expression symbol. 
 */
 class Driver{
	 
	public static void main(String[] args) {
		IAccount account = (name, add, amt) -> {
			System.out.println("Opning Account.." + name + " "+ add +" "+ amt); // Logic Part
			return "Account Open";
		};
		String result = account.openAccount("Kodewala", "BTM Banglore", 1000);

	}

}
