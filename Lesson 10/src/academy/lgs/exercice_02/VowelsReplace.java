package academy.lgs.exercice_02;

public class VowelsReplace {
	
	private String sentences;

	public String getSentences() {
		return sentences;
	}

	public void setSentences(String sentences) {
		this.sentences = sentences;
	}
	
	public void replacerVowels() {
		String sentences = this.sentences.toLowerCase();
		char vowels [] = {'а', 'о' , 'у' , 'е' , 'и', 'і'};
		
		for(char letter : vowels) {
			String s = "" + letter;
			System.out.println(s);
			sentences = sentences.replaceAll(s, "-");
		}
		System.out.println(sentences);
		
		
	}

}
