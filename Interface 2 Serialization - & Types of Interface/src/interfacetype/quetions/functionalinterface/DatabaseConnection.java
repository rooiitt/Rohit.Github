package interfacetype.quetions.functionalinterface;
/*
 * without parameters
 */
@FunctionalInterface
public interface DatabaseConnection {
	void connect();
	

}
class DataDriver{
	public static void main(String[] args) {
		
		DatabaseConnection data = ()->{
			
			System.out.println("Database Connected");
		};
		
		data.connect();
	}
}
