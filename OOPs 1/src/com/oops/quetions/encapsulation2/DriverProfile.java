package com.oops.quetions.encapsulation2;
//RideBooking and DriverProfile
public class DriverProfile {
	private String driverName;
	private boolean available;

	public DriverProfile(String driverName, boolean available) {
		super();
		this.driverName = driverName;
		this.available = available;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}

class RideBooking {
	private DriverProfile driver;

	public RideBooking(DriverProfile driver) {
		this.driver = driver;
	}

	public void assignRide() {
		if (driver.isAvailable()) {
			System.out.println("Ride Assign to: " + driver.getDriverName());
		} else {
			System.out.println("Driver is not available" );
		}

	}

}
