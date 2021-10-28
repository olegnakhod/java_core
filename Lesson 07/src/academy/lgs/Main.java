package academy.lgs;

public class Main {

	public static void main(String[] args) {

		PlaneSU27 plane = new PlaneSU27(23, 17, 23300, 1315, "Блакитний");

		// start engine
		plane.startEngine();

		System.out.println();

		// flight

		plane.fligtTakeOff();
		System.out.println();

		// driving plane

		plane.moveLeft();
		plane.moveDown();
		plane.moveUp();
		plane.moveRight();
		System.out.println();

		// enable stels

		plane.doStealthTechnology();
		System.out.println();

		// NUCLE STRICKE

		plane.doNuclearStrike();
		System.out.println();

		// enable turbospeed

		plane.doTurboAcceleration();
		System.out.println();

		// go home

		plane.landingPlane();
		System.out.println();

	}

}
