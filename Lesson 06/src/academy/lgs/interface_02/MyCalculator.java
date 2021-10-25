package academy.lgs.interface_02;

import academy.lgs.interface_01.Numerable;

public class MyCalculator implements Numerable {

	private double firstNumber;
	private double secondNumber;

	public MyCalculator(double firstNumber, double secondNumber) {
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

	void printResult() {
		System.out.println("Сума вказаних чисел =" + plus());
		System.out.println("Різниця вказаних чисел =" + minus());
		System.out.println("Ділення вказаних чисел =" + devide());
		System.out.println("Множення вказаних чисел =" + multiply());
	}

	@Override
	public double multiply() {
		return firstNumber * secondNumber;
	}

	@Override
	public double plus() {
		return firstNumber + secondNumber;
	}

	@Override
	public double devide() {
		return firstNumber / secondNumber;
	}

	@Override
	public double minus() {
		return firstNumber - secondNumber;
	}

}
