public class App {
	
	class AgeException extends Exception {

		AgeException(String msg) {
			super(msg);
		}

	}

	public static void main (String[] args) {

		try {

			App app = new App();

			app.myAge(-1);

		}catch(AgeException e) {

			System.out.println("Error: " + e.getMessage());

		}finally {

			System.out.println("Bye");

		}


	}

	public void myAge (int age) throws AgeException {

		if(age <= 0) {
			throw new AgeException("Age should be greater than zero");
		}

		System.out.println("Age: " + age);

	} 

}