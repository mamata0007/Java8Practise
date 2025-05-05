package Java8_Program;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
List<Employee> employeelist=Arrays.asList(new Employee(1,"Aahan",2,100000),
		new Employee(2,"Krishna",2,200000),
		new Employee(1,"Swagat",2,30000),
		new Employee(1,"Mama",2,10000),
		new Employee(1,"Mamata",2,50000));
Collections.sort(employeelist,(o1,o2)->o2.getSalary()-o1.getSalary());
System.out.println(employeelist);
	}

}
