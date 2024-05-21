import java.util.Scanner;

public class App {

	public static void main (String[] args) {

		int number = -1;
		Scanner input = new Scanner(System.in);

		do {

			System.out.print("Type a positive number: ");
			number = input.nextInt();

		} while (number < 0);

		System.out.println("The number " + number + " is positive");

	}

}