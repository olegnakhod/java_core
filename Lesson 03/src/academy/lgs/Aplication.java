package academy.lgs;

public class Aplication {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(40, 50);
		Circle circle = new Circle();
		
		circle.setRadius(15.2);
		circle.setDiametr(56.3);
		circle.calculateAreaCircle();
		circle.calculateCircumference();
				

//		r1.calculateArea();
//		r2.calculateArea();

//		r1.calculatePerimetr();
//		r2.calculatePerimetr();
	}
}
