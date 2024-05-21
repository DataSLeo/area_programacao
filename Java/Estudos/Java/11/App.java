public class App {

	public static void main (String[] args) {

		int x = 9;

		if (x > 10) {
			System.out.println("Greater than 10");
		}else {
			System.out.println("Smaller than 10");
		}

		x += 12;

		String res = (x > 10) ? "21" : "Small";

		System.out.println(res);


	}

}