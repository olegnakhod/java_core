package academy.lgs.exercice_01;

public class CoffeRobot extends Robot{
	
	CoffeRobot(String name){
		super(name);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void work() {
		System.out.println("Я " + getName() + " – я варю каву");
	}

}
