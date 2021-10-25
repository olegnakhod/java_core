package academy.lgs.interface_02;

public class Aplication {
	public static void main(String[] args) {
		
		MyCalculator calculator = new MyCalculator (4.5, 1.2);
		
		calculator.printResult();
		
		calculator.setFirstNumber(47);
		calculator.printResult();
		
		calculator.setSecondNumber(3);
		calculator.printResult();
		
	}

}
