package academy.lgs;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Methods m = new Methods();
		File fileOne = new File("fileOne.txt");
		Employee em = new Employee(1,"Vasja", 15000.00);

		m.serialize(em, fileOne);
		System.out.println(m.deserealize(fileOne));

		File fileTwo = new File("fileTwo.txt");

		m.serialize(em, fileTwo);
		System.out.println(m.deserealize(fileOne));
		
		
		File fileThree = new File("fileThree.txt");
		
		List<Employee> listEmployee = new ArrayList();
		listEmployee.add(new Employee(2,"Olja", 16000.00));
		listEmployee.add(new Employee(3,"Vira", 21000.00));
		listEmployee.add(new Employee(4,"Vova", 19000.00));
		listEmployee.add(new Employee(5,"Tanja", 14000.00));
		
		m.serialize((Serializable) listEmployee,fileThree );
		System.out.println(m.deserealize(fileThree));
	}

}
