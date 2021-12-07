package academy.lgs.exercice_01;

public class Aplication {
	
	public static void main(String[] args) {
		
		Pet cat = voice -> System.out.println("Кіт каже " + voice); 
		Pet dog = voice -> System.out.println("Пес каже " + voice);
		Pet cow = voice -> System.out.println("Корова каже " + voice);
		
		cat.voice("мяу-мяу");
		dog.voice("гав-гав");
		cow.voice("мууу-мууу");
	}
	

}

interface Pet {
	void voice(String voice);
}


