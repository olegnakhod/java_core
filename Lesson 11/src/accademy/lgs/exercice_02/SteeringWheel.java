package accademy.lgs.exercice_02;

import java.util.Random;

public class SteeringWheel {

	RandomValues rv = new RandomValues();
	private int diametrWheel;
	private String material;

	public SteeringWheel(int diametrWheel) {
		this.diametrWheel = diametrWheel;
		this.material = setMaterial();

	}

	public int getDiametrWheel() {
		return diametrWheel;
	}

	public void setDiametrWheel(int diametrWheel) {
		this.diametrWheel = diametrWheel;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	private String setMaterial() {
		MaterialWheel[] material = MaterialWheel.values();
		String materialWheel = MaterialWheel.Резина.toString();

		for (MaterialWheel mat : material) {
			if (mat.getNumber() == rv.getRandom(1, 3)) {
				materialWheel = mat.name();
				break;
			}

		}
		return materialWheel;

	}

	@Override
	public String toString() {
		return "діаметр керма = " + diametrWheel + ", матеріал = " + material;
	}

}
