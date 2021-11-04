package academy.lgs.exercice_01;

import java.util.Scanner;

public class Palindrom {

	private String word;
	
	

	public Palindrom(String word) {
		super();
		this.word = word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	public void herald() throws MyExeption {
		boolean result = palindromFinder();
		if(result) {
			System.out.println("Слово <<" + this.word + ">> - паліндром");
		}else {
			System.out.println("Слово <<" + this.word + ">> - не є паліндромом");
		}
	}

	private boolean palindromFinder() throws MyExeption {
		boolean findPalindrom;
		if (this.word == null) {
			findPalindrom = false;
		} else {
			if (this.word.length() == 5) {
				StringBuilder sb = new StringBuilder(this.word.toLowerCase());
				String word = sb.reverse().toString(); 
				System.out.println(word);
				findPalindrom = this.word.toLowerCase().equals(word);
			} else {
				String massage = "У слові більше або менше 5-ти букв. Введіть будь-ласка слово із 5-ти букв";
				throw new MyExeption(massage);
			}
		}
		return findPalindrom;
	}

}
