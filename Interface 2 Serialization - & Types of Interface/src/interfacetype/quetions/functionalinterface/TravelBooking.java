package interfacetype.quetions.functionalinterface;

@FunctionalInterface
public interface TravelBooking {
	void bookingTicket(String source, String destination);

	default void sendConformation() {
		connectedDB();
		System.out.println("Send Conformation");
	}

	static boolean validateBookingId(String booking) {
		return booking != null && booking.startsWith("TRV");

	}

	private void connectedDB() {
		System.out.println("Connected to DataBase");
	}

}

class TravelDriver {
	public static void main(String[] args) {

		TravelBooking travel = (source, destination) -> {
			System.out.println("Booking ticket from " + source + " to " + destination);
		};

		travel.bookingTicket("Maharashtra", "Karnatka");

		travel.sendConformation();

		boolean result = TravelBooking.validateBookingId("TRV123");

		System.out.println("Booking id is valid " + result);
	}
}
