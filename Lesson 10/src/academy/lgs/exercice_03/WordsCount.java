package academy.lgs.exercice_03;

public class WordsCount {

	private String sentences;

	public String getSentences() {
		return sentences;
	}

	public void setSentences(String sentences) {
		this.sentences = sentences;
	}

	public void herald() {
		System.out.println();

	}

	public void printWordCounter() {
		System.out.println(wordCounter());
	}

	public void printWordsRepeat() {
		System.out.println(wordsRepeat());
	}

	private String wordCounter() {
		int count = 0;

		String words[] = sentences.split(" ");

		for (String word : words) {
			if (word.length() >= 3) {
				count++;
			}
		}
		return ("У даній стрічці " + count + " слів");
	}

	private String wordsRepeat() {

		String[] array = sentences.trim().toLowerCase().split(" ");
		int maxCount = 0;
		String maxWords = array[0];
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i].length() >= 3) {
					if (array[i].equals(array[j])) {
						count++;
					}
				}
			}
			if (count > maxCount) {
				maxCount = count;
				maxWords = array[i];
			}
		}
		return ("Слово: <<" + maxWords + ">> повторюється найбільше разів. Кількість повторів =  " + maxCount);
	}

}
