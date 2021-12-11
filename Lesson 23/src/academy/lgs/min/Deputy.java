package academy.lgs.min;

import java.util.Objects;

public class Deputy extends Human implements Comparable<Deputy> {

	private String name;
	private String surName;
	private int age;
	private boolean isGrafter;
	private int sizeOfBribe;
	RandomValues r = new RandomValues();

	public Deputy(int weight, int height, String name, String surName, int age, boolean isGrafter) {
		super(weight, height);
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.isGrafter = isGrafter;
		giveBribe();
	}

	public String getName() {
		return name;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getSurName() {
		return surName;
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

	public boolean isGrafter() {
		return isGrafter;
	}

	public void setGrafter(boolean isGrafter) {
		this.isGrafter = isGrafter;
	}

	public int getSizeOfBribe() {
		return sizeOfBribe;
	}

	public void setSizeOfBribe(int sizeOfBribe) {
		this.sizeOfBribe = sizeOfBribe;
	}

	public void giveBribe() {
		int sizeOfBribe = r.getRandom(1000, 6000);
		if (isGrafter != true) {
			System.out.println("Цей депутат не бере хабарів");
		} else {
			if (sizeOfBribe >= 5000) {
				System.out.println("Депутат їде на канікули до в'язниці");
			} else {
				setSizeOfBribe(sizeOfBribe);
			}

		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, isGrafter, name, r, sizeOfBribe, surName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deputy other = (Deputy) obj;
		return age == other.age && isGrafter == other.isGrafter && Objects.equals(name, other.name)
				&& Objects.equals(r, other.r) && sizeOfBribe == other.sizeOfBribe
				&& Objects.equals(surName, other.surName);
	}

	@Override
	public int compareTo(Deputy o) {
		if (this.sizeOfBribe > o.getSizeOfBribe()) {
			return -1;
		} else if (this.sizeOfBribe < o.getSizeOfBribe()) {
			return 1;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "name= " + name + ", surName= " + surName + ", age=" + age + ", isGrafter= " + isGrafter
				+ ", sizeOfBribe=" + sizeOfBribe + "\n";
	}


}
