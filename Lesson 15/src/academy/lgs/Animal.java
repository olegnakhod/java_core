package academy.lgs;

public class Animal {

	private String kind;
	private String name;

	public Animal(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "вид: " + kind +  "--> кличка: " + name;
	}

}
