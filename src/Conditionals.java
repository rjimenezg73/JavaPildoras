
public class Conditionals {

	public static void main(String[] args) {
		
		boolean food = hotFood();
		boolean table = tableServed();
		
		System.out.println("Let's check the first table...");
		if (table && food) {
			System.out.println("Time to eat!");
		} else {
			System.out.println("Let's wait!");
		}
	}
	
	public static boolean hotFood() {
		System.out.println("Evaluating hot food!");
		return true;
	}
	
	public static boolean tableServed() {
		System.out.println("Evaluating table served!");
		return false;
	}
}
