package academy.lgs.exercice_02;

public class MyExeption extends Exception {

	String massage;

	public MyExeption(String massage) {
		super(massage);
		this.massage = massage;
	}

	public String getMassage() {
		return massage;
	}

}
