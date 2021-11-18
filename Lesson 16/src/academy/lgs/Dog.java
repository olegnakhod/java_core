package academy.lgs;

import java.util.Objects;

public class Dog extends Animal {

	private String name;
	private int weight;
	private int age;

	public Dog() {
		super();
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public Dog(String name, int weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(name, other.name) && weight == other.weight;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
	public static void  myMethod(String name, int spin) {
		System.out.println(name + " перед тим як спати ще " +spin +  " разів покрутиться навколо себе");
	}
	
	public static void myMethod(String name) {
		System.out.println(name + " буде сьогодні спати у себе в ліжечку");
	}

}
