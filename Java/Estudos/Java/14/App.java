public class App {

	public static void main (String[] args) {

		int[] score = {10, 14, 15, 17};

		for(int value : score) {

			System.out.println("Foreach: " + value);

		}

		for(int i = 0; i < score.length; i++) {

			System.out.println("Normal for: " + score[i]);

		}

	}

}