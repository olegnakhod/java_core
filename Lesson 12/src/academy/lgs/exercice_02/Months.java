package academy.lgs.exercice_02;

public enum Months {

	СІЧЕНЬ(Seasons.ЗИМА, 31), ЛЮТИЙ(Seasons.ЗИМА, 28), БЕРЕЗЕНЬ(Seasons.ВЕСНА, 31), КВІТЕНЬ(Seasons.ВЕСНА, 30),
	ТРАВЕНЬ(Seasons.ВЕСНА, 30), ЧЕРВЕНЬ(Seasons.ЛІТО, 30), ЛИПЕНЬ(Seasons.ЛІТО, 31), СЕРПЕНЬ(Seasons.ЛІТО, 31),
	ВЕРЕСЕНЬ(Seasons.ОСІНЬ, 30), ЖОВТЕНЬ(Seasons.ОСІНЬ, 31), ЛИСТОПАД(Seasons.ОСІНЬ, 30),
	ГРУДЕНЬ(Seasons.ЗИМА, 31);

	private int days;
	Seasons season;

	public int getDays() {
		return days;
	}

	public Seasons getSeason() {
		return season;
	}

	private Months(Seasons season, int days) {
		this.days = days;
		this.season = season;
	}

}
