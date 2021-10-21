package academy.lgs.exercice_01;

public class Aplication {

	public static void main(String[] args) {

		Robot r = new Robot("Robot");
		CoffeRobot cr = new CoffeRobot("CoffeRobot");
		RobotDancer rd = new RobotDancer("RobotDancer");
		RobotCoocker rc = new RobotCoocker("RobotCoocker");

//		r.work();
//		cr.work();
//		rd.work();
//		rc.work();

		Robot argsRobot[] = { r, cr, rd, rc };

		for (Robot robots : argsRobot) {
			robots.work();
		}
	}

}
