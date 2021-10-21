package academy.lgs.exercice_01;

public class Robot {
	
	private String name;
	
	Robot (String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void work() {
		System.out.println("Я " + this.name+ " – я просто працюю");
	}
}
