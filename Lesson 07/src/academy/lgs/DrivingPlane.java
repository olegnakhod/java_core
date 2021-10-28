package academy.lgs;

public class DrivingPlane {

	RandomDistance random =  new RandomDistance();

	public int moveUp() {
		return random.calculateDistance();
	}

	public int moveDown() {
		return random.calculateDistance();
	}

	public int moveLeft() {
		return random.calculateDistance();
	}

	public int moveRight() {
		return random.calculateDistance();
	}
}
