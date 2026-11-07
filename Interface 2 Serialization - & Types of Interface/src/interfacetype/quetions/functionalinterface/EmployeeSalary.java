package interfacetype.quetions.functionalinterface;

@FunctionalInterface
public interface EmployeeSalary {
	void calculateSalary(double basicSalary);

	default void displaySalary() {
		calculateTax();
		System.out.println("Employee Salary");
	}

	static boolean validateSalary(double salary) {
		return true;

	}

	private int calculateTax() {
		return 0;

	}

}

class EmployeeDriver {
	public static void main(String[] args) {
		EmployeeSalary employee = (salary) -> {
			System.out.println("Employee basic Salary " + salary);
		};
		employee.calculateSalary(12000);
		employee.displaySalary();

		boolean salary = EmployeeSalary.validateSalary(1200);
		System.out.println("Validating Salary " + salary);

	}
}