package academy.lgs.exercice_01;

public class Aplication {

	public static void main(String[] args) throws MyExeption {
		
		Palindrom p = new Palindrom ("ротор");
		
		p.herald();
		
//		p.setWord("коса");
//		p.herald();
		
		p.setWord("лікар");
		p.herald();
		
		
		

	}

}
