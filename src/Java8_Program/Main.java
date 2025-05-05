package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

		
		public static void main(String[] args) {

			List<EmployeewithhighestSalary> employee=Arrays.asList(new EmployeewithhighestSalary(1,"Krishna",20000),
			new EmployeewithhighestSalary(2,"Swagat",30000),
			new EmployeewithhighestSalary(1,"Mamata",20000));
			EmployeewithhighestSalary maxsalary=employee.stream()
					.max(Comparator.comparingDouble(EmployeewithhighestSalary::getSalary)).orElse(null);
			System.out.println(maxsalary);
		}
		}


