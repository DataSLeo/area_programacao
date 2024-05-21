public class App {

	public static void main (String[] args) {

		long timeBegin = System.nanoTime();

		for(int i = 0; i <= 1000; i++) {};

		long timeEnd = System.nanoTime();

		System.out.println("Nano time: " + (timeEnd - timeBegin));

	}

}