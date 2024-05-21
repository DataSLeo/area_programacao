import java.util.Scanner;

public class App {

	public static void main (String[] args) {

		String name = "";

		Scanner input = new Scanner(System.in);

		while(!name.equals("leonardo")) {

			System.out.print("What is your name? ");

			name = input.nextLine();
			name = name.toLowerCase();

		}

		System.out.println(name + " is the most sexy name ever");

		input.close();

	}

}