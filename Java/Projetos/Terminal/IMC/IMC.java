public class IMC {

	private double weight;
	private double height;

	IMC () {

		this.height = 0;
		this.height = 0;

	}
	
	public void setWeight (double weight) throws IllegalArgumentException {

		if (weight <= 0) {
			throw new IllegalArgumentException("The weight cannot be negative");
		}

		this.weight = weight;

	}

	public void setHeight (int height) throws IllegalArgumentException {

		if (height <= 0) {
			throw new IllegalArgumentException("The height cannot be negative");
		}

		this.height = (double) height / 100;

	} 

	public double getWeight () {

		return this.weight;

	}

	public double getHeigth () {

		return this.height;

	}

	public double imc () throws IllegalArgumentException {

		if(this.weight == 0 || this.height == 0) {
			throw new IllegalArgumentException("The weight or height cannot be zero");
		} 

		double h = this.height * this.height;

		return this.weight / h;

	}

	public void clfPrint (double imc) throws IllegalArgumentException {

		if(imc <= 0) {
			throw new IllegalArgumentException("IMC should be greater than zero");
		}

		if(imc < 18.5) {
			System.out.println("Low weight");
		}else if(imc < 24.9) {
			System.out.println("Normal");
		}else if(imc < 29.9) {
			System.out.println("Overweight");
		}else if (imc < 34.9) {
			System.out.println("Obesity 1");
		}else if (imc < 39.9) {
			System.out.println("Obesity 2");
		}else {
			System.out.println("Extreme obesity");
		}

	}

}