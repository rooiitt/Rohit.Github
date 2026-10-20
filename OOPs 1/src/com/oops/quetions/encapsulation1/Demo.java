package com.oops.quetions.encapsulation1;

public class Demo {
	
//	If two objects call setX() with different values, will they affect each other's x? Why?
	
	    private int x = 10;

	    public void setX(int x) {
	        this.x = x;
	    }
	    public int getX() {
	        return x;
	}
class Driver{
	public static void main(String[] args) {
		Demo d = new Demo();
		Demo d1 = new Demo();
		
		d.setX(67);
		d1.setX(77);
		
		System.out.println(d.getX());
		System.out.println(d1.getX());
		
	}
}
}


