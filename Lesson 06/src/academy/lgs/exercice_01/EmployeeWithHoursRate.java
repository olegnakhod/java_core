package academy.lgs.exercice_01;

public class EmployeeWithHoursRate extends Employee implements Salary {
	public final int WORKING_HOURS_OF_PER_DAY = 8;
	private int hourRate;

	public EmployeeWithHoursRate(int workedDay, int hourRate) {
		super(workedDay);
		this.hourRate = hourRate;
	}

	public int getHourRate() {
		return hourRate;
	}

	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}

	@Override
	public void printSalary() {
		System.out.println("Зарплата працівника з погодинною оплатою становить =" + calculateSalary());
	}

	private int calculateSalary() {
		int salary = hourRate * (getWorkedDay() * WORKING_HOURS_OF_PER_DAY);
		return salary;
	}
}
