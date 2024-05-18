public class App {

	public static void main (String[] args){

		int sideA = 10;
		int sideB = 12;
		
		int n1 = sideA + sideB;
		int n2 = sideA - sideB;
		int n3 = sideA * sideB;
		float n4 = (float) sideA / (float) sideB;
		int n5 = sideA % sideB; 

		System.out.println("Sum: " + n1);
		System.out.println("Sub: " + n2);
		System.out.println("Mult: " + n3);
		System.out.println("Div: " + n4);
		System.out.println("Mod: " + n5);

	}

}