package academy.lgs.exercice_02;

public enum MaterialWheel {

	Шкіра(1), Шкірозамінник(2), Резина(3);

	private int number;

	private MaterialWheel(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

}
