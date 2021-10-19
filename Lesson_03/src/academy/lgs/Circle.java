package academy.lgs;

public class Circle {

	private double radius;
	private double diametr;
	public final double Pi = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiametr() {
		return diametr;
	}

	public void setDiametr(double diametr) {
		this.diametr = diametr;
	}

	public void calculateAreaCircle() {
		double areaCircle = (this.diametr / 2) * (this.diametr / 2) * Pi;
		System.out.println("Площа кола = " + areaCircle);
	}

	public void calculateCircumference() {
		double circumference = this.radius * Pi * 2;
		System.out.println("Довжина кола = " + circumference);
	}
}
