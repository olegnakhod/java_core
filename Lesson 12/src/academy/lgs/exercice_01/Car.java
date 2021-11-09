package academy.lgs.exercice_01;

public class Car {

	private int horsePower;
	private int productionYear;
	public SteeringWheel steeringwheel;
	public Engine engine;

	public Car(int horsePower, int productionYear, SteeringWheel steeringwheel, Engine engine) {
		this.horsePower = horsePower;
		this.productionYear = productionYear;
		this.steeringwheel = steeringwheel;
		this.engine = engine;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public SteeringWheel getHelm() {
		return steeringwheel;
	}

	public void setHelm(SteeringWheel helm) {
		this.steeringwheel = helm;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Автомобіль -- кінські сили = " + horsePower + ", рік випуску = " + productionYear + " , " + steeringwheel  + " , " + engine;
	}
	
	

}
