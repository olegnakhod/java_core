package academy.lgs.exercice_01;

public class EmployeeWithMonthRate extends Employee implements Salary {

	public final int WORKING_DAYS_OF_PER_MONTH = 21;
	private int monthRate;

	public EmployeeWithMonthRate(int monthRate, int workedDay) {
		super(workedDay);
		this.monthRate = monthRate;
	}

	public int getMonthRate() {
		return monthRate;
	}

	public void setMonthRate(int monthRate) {
		this.monthRate = monthRate;
	}

	@Override
	public void printSalary() {
		System.out.println("Зарплата працівника з місячною оплатою становить =" + calculateSalary());
	}

	private int calculateSalary() {
		int salary = monthRate * (getWorkedDay() / WORKING_DAYS_OF_PER_MONTH);
		return salary;
	}

}