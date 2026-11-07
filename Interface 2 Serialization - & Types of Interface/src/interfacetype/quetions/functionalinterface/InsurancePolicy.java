package interfacetype.quetions.functionalinterface;

@FunctionalInterface
public interface InsurancePolicy {
	void calculatePremium(double insecureAmount);

	default void generatePolicy() {
		validateInsuredAmount(120);
		connectToInsuranceDatabase();
		System.out.println("Generate Policy");
	}

	default void sendPolicyNotification() {
		validateInsuredAmount(120);
		connectToInsuranceDatabase();
		System.out.println("Policy Notification");
	}

	static String validatePolicyHolder(String name) {
		return name;
	}

	private void connectToInsuranceDatabase() {
		System.out.println("Connected to Insurance Database");

	}

	private static double validateInsuredAmount(double amount) {
		return amount;

	}

}

class InsuranceDriver {
	public static void main(String[] args) {
		InsurancePolicy insurance = (insecureAmount) -> {
			if (insecureAmount <= 100000) {
				double premium = insecureAmount * 2 / 100;

				System.out.println("Premium: " + premium);
			} else if (insecureAmount <= 500000) {

				double premium = insecureAmount * 3 / 100;
				System.out.println("Premium: " + premium);
			} else {
				double premium = insecureAmount * 5 / 100;

				System.out.println("Premium: " + premium);
			}
		};

		insurance.calculatePremium(500000);
		insurance.generatePolicy();
		insurance.sendPolicyNotification();

		String result = InsurancePolicy.validatePolicyHolder("Rohit");
		System.out.println("Insurance Policy Holder " + result);
	}
}
