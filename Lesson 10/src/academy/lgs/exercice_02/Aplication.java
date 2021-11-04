package academy.lgs.exercice_02;

public class Aplication {

	public static void main(String[] args) {
		
		VowelsReplace vr = new VowelsReplace();
		
		vr.setSentences("А завтра нас усіх чекає осінь –\r\n"
				+ "Красива, фантастична, золота!\r\n"
				+ "І вересневі ранки – теплі, босі,\r\n"
				+ "І вечори, й холодна ніч густа…");
		vr.replacerVowels();
	}

}
