package academy.lgs.exercice_01;

public class MyExeption extends Exception{
	
	private String massage;
	
	public MyExeption(String massage) {
		this.massage = massage;
		System.err.println(massage);
	}

}
