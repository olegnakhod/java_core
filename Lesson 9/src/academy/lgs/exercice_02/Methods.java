package academy.lgs.exercice_02;

public class Methods {

	private double firstNumber;
	private double secondNumber;

	public Methods(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void Plus() throws MyExeption{
		if (firstNumber > 0 && secondNumber > 0) {
			String massage = "Числа " + firstNumber + " та " + secondNumber + " додатні. Введіть числа менші нуля";
			throw new MyExeption(massage);
		} else {
			System.out.println(firstNumber + secondNumber);
		}
	}

	public void Minus() throws IllegalArgumentException{
		if (firstNumber == 0 && secondNumber == 0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println(firstNumber - secondNumber);
		}
	}

	public void Devide() throws ArithmeticException{
		if ((firstNumber == 0 && secondNumber != 0) || (firstNumber != 0 && secondNumber == 0)) {
			throw new ArithmeticException();
		} else {
			System.out.println(firstNumber / secondNumber);
		}

	}

	public void Multyply() throws IllegalArgumentException{
		if (firstNumber < 0 && secondNumber < 0) {
			throw new IllegalArgumentException();
		} else {
			System.out.println(firstNumber * secondNumber);
		}
	}

}
