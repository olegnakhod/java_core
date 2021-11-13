package academy.lgs.exercice_02;

import java.util.Objects;

public class Commodity {

	private String name;
	private int widht;
	private int length;
	private int weight;

	public Commodity(String name, int widht, int length, int weight) {
		this.name = name;
		this.widht = widht;
		this.length = length;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name=" + name + "," + " widht=" + widht + "," + " length=" + length + "," + " weight=" + weight;
	}

	@Override
	public int hashCode() {
		return Objects.hash(length, name, weight, widht);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		return length == other.length && Objects.equals(name, other.name) && weight == other.weight
				&& widht == other.widht;
	}

}
