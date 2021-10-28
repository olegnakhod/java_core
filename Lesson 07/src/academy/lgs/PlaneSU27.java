package academy.lgs;

public class PlaneSU27 extends Plane implements SpecialOpportunities {

	private int maxSpeed;
	private String color;
	DrivingPlane driving = new DrivingPlane();
	RandomDistance random = new RandomDistance();

	public PlaneSU27(int lengthOfAPlane, int widthOfAPlane, int weightOfAplane, int maxSpeed, String color) {
		super(lengthOfAPlane, widthOfAPlane, weightOfAplane);
		this.maxSpeed = maxSpeed;
		this.color = color;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void doStealthTechnology() {
		System.out.println("Літака не видно протягом:" + random.calculateDistance() + " м");
	}

	@Override
	public void doNuclearStrike() {
		System.out.println("Боєголовок скинуто:" + random.calculateDistance() / 100 + " шт");
	}

	@Override
	public void doTurboAcceleration() {
		System.out.println("Турбошвидкість увімкнена. Максимальна швидкість:"
				+ (this.maxSpeed + (random.calculateDistance())) / 5 + " км/год");
	}

	public void moveLeft() {
		System.out.println("Поворот літака вліво на: " + driving.moveLeft() + " м");
	}

	public void moveRight() {
		System.out.println("Поворот літака вліво на: " + driving.moveRight() + " м");
	}

	public void moveUp() {
		System.out.println("Підняти літак вгору на: " + driving.moveUp() + " м");
	}

	public void moveDown() {
		System.out.println("Опустити літак вниз на: " + driving.moveDown() + " м");
	}
}
