package academy.lgs.exercice_02;

public class Engine {
	
	private int countPistons;

	public Engine(int countPistons) {
		this.countPistons = countPistons;
	}

	public int getEngineCapacity() {
		return countPistons;
	}

	public void setEngineCapacity(int countPistons) {
		this.countPistons = countPistons;
	}

	@Override
	public String toString() {
		return "кількість поршнів = " + countPistons;
	}
	
	
	
	
	
	

}
