package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondhighestSalary {

	public static void main(String[] args) {
		List<EmployeewithhighestSalary> employee=Arrays.asList(new EmployeewithhighestSalary(1,"Krishna",20000),
				new EmployeewithhighestSalary(2,"Swagat",30000),
				new EmployeewithhighestSalary(1,"Mamata",20000));
				Optional<EmployeewithhighestSalary> secmaxsalary=employee.stream()
						.sorted(Comparator.comparingDouble(EmployeewithhighestSalary::getSalary).reversed())
						.distinct().skip(1).findFirst();
				System.out.println(secmaxsalary);

	}

}
