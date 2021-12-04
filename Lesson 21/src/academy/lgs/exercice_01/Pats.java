package academy.lgs.exercice_01;

public class Pats {

	@Fielder("Name some animal")
	private String name;
	@Fielder("Age some animal")
	private int age;
	private int weight;
	@Fielder("Height some animal")
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Pats(String name, int age, int weight, int height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
}
