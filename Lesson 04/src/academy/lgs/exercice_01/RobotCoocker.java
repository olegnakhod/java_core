package academy.lgs.exercice_01;

public class RobotCoocker extends Robot{
	
	RobotCoocker(String name){
		super(name);
	}
	
	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public void work() {
		System.out.println("Я " + getName() + " – я просто готую");
	}

}
