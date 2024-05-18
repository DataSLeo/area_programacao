// Importing a class named Scanner
import java.util.Scanner;

public class App {

	public static void main (String[] args){

		// Instancing Scanner
		Scanner input = new Scanner(System.in);

		int age;
		System.out.print("What is your age? ");

		// Get a int
		age = input.nextInt();

		System.out.println("Your age is: " + age);

		// Closing Scanner
		input.close();

	}

}