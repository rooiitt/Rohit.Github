package com.oops.quetions.encapsulation2;
// Online Payment
public class Payment {
	private int amount;

	public void setAmount(int amount) {
		if (amount > 0) {
			this.amount = amount;
			System.out.println("Playment Accepted");
		} else {
			System.out.println("Payment Must Have Positive Value");

		}
	}

	public int processPayment() {
		return amount;
	}
	public static void main(String[] args) {
		Payment p = new Payment();
		p.setAmount(777);
		System.out.println(p.processPayment());
	}

}
//class ParkingMeter {
//    private int minutes = 60;
//
//    public void addMinutes(int minutes) {
//        if (minutes > 0) {
//            this.minutes += minutes; // 60 + 40 = 100
//        } else {
//            System.out.println("Invalid time");
//        }
////        this.minutes = 0;  ---> this will make the it zero assignment statement is 
//        //is out side of the block.
//    } 
//    public int getMinutes() {
//    	return minutes; 
//    }
//    public static void main(String[] args) {
//    	ParkingMeter p = new ParkingMeter();
//    	p.addMinutes(40); // 
//    	System.out.println(p.getMinutes());
//    	
//	}
//}
