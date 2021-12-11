package academy.lgs.max.exercice_01;

import java.util.Objects;

public class Pets implements Comparable<Pets>{

	private String name;
	private int age;

	public Pets(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "name= " + name + ", age= " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pets other = (Pets) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Pets p) {
		return this.name.compareTo(p.getName());
	}
	
	

}
