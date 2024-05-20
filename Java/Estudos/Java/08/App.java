public class App {

	public static void main (String[] args) {

		printMsg("This is a message");

		App app = new App();

		app.printAge(20);

	}

	public static void printMsg (String msg) {

		System.out.println("The message is: " + msg);

	}

	public void printAge (int age) {

		System.out.println("Age is: " + age);

	}

}