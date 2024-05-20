import java.util.Scanner;

public class App {

	public static void main (String[] args){

		final float PI = 3.14f;

		Scanner input = new Scanner(System.in);

		float radius;

		System.out.print("Put here the radius: ");

		radius = input.nextFloat();

		float cal = PI * (radius * radius);

		System.out.println("The area of circle is: " + cal);

		input.close();	

	}

}