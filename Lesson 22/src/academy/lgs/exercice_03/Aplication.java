package academy.lgs.exercice_03;

public class Aplication {

	public static void main(String[] args) {

		Mover frogMover = Frog::new;
		
		frogMover.move().eat();
		frogMover.move().walk();
		frogMover.move().sleep();
		frogMover.move().swim();
	}
}
