import java.util.Scanner;

public class App {

	public static void main (String[] args) {

		IMC imc = new IMC();
		Scanner input = new Scanner(System.in);

		while (true) {
			
			double data = 0;

			try {

				if(imc.getWeight() <= 0) {

					System.out.print("Type your weight here (kg): ");
					data = input.nextDouble();
					imc.setWeight(data);

				}

				System.out.print("Type your height (cm): ");
				data = (double) input.nextInt();
				imc.setHeight((int) data);	

				double imcValue = imc.imc();

				System.out.println("Your IMC is: " + imcValue);

				System.out.print("Your classification is: ");
				imc.clfPrint(imcValue);

				break;

			}catch(IllegalArgumentException e) {

				System.out.println(e.getMessage());

			}	

		}

		

		input.close();



	}

}