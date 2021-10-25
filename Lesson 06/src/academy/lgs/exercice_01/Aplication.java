package academy.lgs.exercice_01;

public class Aplication {

	public static void main(String[] args) {

		EmployeeWithHoursRate employeeOne = new EmployeeWithHoursRate(25, 25);
		EmployeeWithMonthRate employeeTwo = new EmployeeWithMonthRate(5600, 25);

		employeeOne.printSalary();
		employeeTwo.printSalary();
		
		employeeOne.setHourRate(30);
		employeeOne.printSalary();

	}

}
