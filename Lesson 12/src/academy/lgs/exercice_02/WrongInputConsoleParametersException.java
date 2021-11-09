package academy.lgs.exercice_02;

public class WrongInputConsoleParametersException extends Exception {
	private String massage;

	public WrongInputConsoleParametersException(String massage) {
		super(massage);
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}
}
