package academy.lgs;

public abstract class Plane {

	private int lengthOfAPlane;
	private int widthOfAPlane;
	private int weightOfAplane;

	public Plane(int lengthOfAPlane, int widthOfAPlane, int weightOfAplane) {
		this.lengthOfAPlane = lengthOfAPlane;
		this.widthOfAPlane = widthOfAPlane;
		this.weightOfAplane = weightOfAplane;
	}

	public int getLengthOfAPlane() {
		return lengthOfAPlane;
	}

	public void setLengthOfAPlane(int lengthOfAPlane) {
		this.lengthOfAPlane = lengthOfAPlane;
	}

	public int getWidthOfAPlane() {
		return widthOfAPlane;
	}

	public void setWidthOfAPlane(int widthOfAPlane) {
		this.widthOfAPlane = widthOfAPlane;
	}

	public int getWeightOfAplane() {
		return weightOfAplane;
	}

	public void setWeightOfAplane(int weightOfAplane) {
		this.weightOfAplane = weightOfAplane;
	}

	public void startEngine() {
		int timeToStart = 20 + (int) (Math.random() * 88);
		System.out.println("Час до сапуску = " + timeToStart + " сек");
	};

	public void fligtTakeOff() {
		int random = (int) (Math.random() * 1000);
		System.out.println("Літак із повним баком пройде = " + random + " км");
	};

	public void landingPlane() {
		System.out.println("Літак іде на посадку ");
	};

}
