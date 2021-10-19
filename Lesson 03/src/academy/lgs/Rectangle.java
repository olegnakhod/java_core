package academy.lgs;

public class Rectangle {

	private int widht;
	private int hight;

	Rectangle() {
		this.widht = 20;
		this.hight = 10;
	}

	Rectangle(int width, int hight) {
		this.widht = width;
		this.hight = hight;
	}

	public void calculateArea() {
		System.out.println("Площа прямокутника = " + this.widht * this.hight);
	}

	public void calculatePerimetr() {
		System.out.println("Периметр прямокутника = " + ((this.widht * 2) + (this.hight * 2)));
	}
}
