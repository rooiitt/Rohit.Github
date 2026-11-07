package interfacetype.quetions.functionalinterface;

@FunctionalInterface
public interface Transiction {
	double transiction(double amount, double balance);

}

class DriverTransiction {
	public static void main(String[] args) {

		Transiction transiction = (amount, balance) -> {

			if (amount > balance) {
				return -1;
			}
			double tottalBalance = balance - amount;
			return tottalBalance;

		};
		double result = transiction.transiction(120, 300);
		System.out.println("Remaining Balnce"+" "+result);
		

	}
}
