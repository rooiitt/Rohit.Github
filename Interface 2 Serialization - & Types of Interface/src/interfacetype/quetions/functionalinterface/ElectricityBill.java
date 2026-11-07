package interfacetype.quetions.functionalinterface;

public interface ElectricityBill {
	double calculateBill(int unit);

}

class ElectricBillDriver {
	public static void main(String[] args) {
		
		ElectricityBill electric = (unit) -> {
			
			if (unit >= 100) 
			{
				return unit * 5;
				
			} else 
			{
				return (100 * 5) + ((unit - 100) * 8);
			}
			
		};
		double tottalbill = electric.calculateBill(200);
		System.out.println("Tottal Electric Bill" +" "+tottalbill );
		
	
		
	}
}
