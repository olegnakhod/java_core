package academy.lgs.exercice_02;

public class Aplication {
	public static void main(String[] args) {
		PhoneCreator phone = Phone::new;
		phone.reflector("OnePlus", 400, "30981234567");
	}
}
