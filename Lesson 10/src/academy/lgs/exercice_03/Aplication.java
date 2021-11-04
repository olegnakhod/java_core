package academy.lgs.exercice_03;

public class Aplication {

	public static void main(String[] args) {
		
		WordsCount wc = new WordsCount();
		
		wc.setSentences("ТЩо несе на спинці\r\n"
				+ "Спритний їжачок?\r\n"
				+ "Золотий листок.\r\n"
				+ "Що несе на спинці\r\n"
				+ "В дощик і сльоту?\r\n"
				+ "Він несе на спинці\r\n"
				+ "Осінь золоту.");
		
		wc.printWordCounter();
		wc.printWordsRepeat();

	}
	

}
