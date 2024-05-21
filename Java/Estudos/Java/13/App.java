public class App {

	public static void main (String[] args) {

		int x = 5;

		switch(x){

		case 1,2:
			System.out.println("Red");
			break;
		case 3,4:
			System.out.println("Blue");
			break;
		case 5,6:
			System.out.println("Green");
			break;
		default:
			System.out.println("Color not found!");

		}

	}

}