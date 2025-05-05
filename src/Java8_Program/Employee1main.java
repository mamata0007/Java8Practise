package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee1main {

	public static void main(String[] args) {
List<Employee1> employeedetails=Arrays.asList(new Employee1(1,"Aahan",2,"Doctor","Male",2023,5000000),
		new Employee1(3,"Swagat",31,"IT","Male",1993,150000),
		new Employee1(5,"Babita",36,"Finance","Female",1987,90000),
		new Employee1(2,"Santosh",34,"Marketing","Male",1990,300000),
		new Employee1(4,"Jitendra",38,"Finance","Female",1984,100000),
		new Employee1(188, "Wang Liu", 31, "Product Development","Male", 2015, 34500.0),
		new Employee1(199, "Amelia Zoe", 24, "Sales And Marketing","Female", 2016, 11500.0),
		new Employee1(200, "Jaden Dough", 38, "Security And Transport","Male" ,2015, 11000.5),
		new Employee1(211, "Jasna Kaur", 27,  "Infrastructure","Female", 2014, 15700.0),
		new Employee1(222, "Nitin Joshi", 25,  "Product Development", "Male",2016, 28200.0));
//How many male and female employees are there in the organization?

Map<String,Long> results=employeedetails.stream()
		.collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting()));
System.out.println(results);

//Print the name of all departments in the organization?

List<String> results1=employeedetails.stream().map(Employee1::getDepartment).distinct().toList();
System.out.println(results1);


//What is the average age of male and female employees?

Map<String ,Double> results2=employeedetails.stream()
.collect(Collectors.groupingBy(Employee1::getGender,Collectors.averagingInt(Employee1::getAge)));
System.out.println(results2);

// Get the details of highest paid employee in the organization?



Optional<Employee1> results3=employeedetails.stream()
		 .collect(Collectors.maxBy(Comparator.comparingDouble(Employee1::getSalary)));
System.out.println(results3);

// Get the names of all employees who have joined after 2015?


List<String> results4=employeedetails.stream()
.filter(e->e.getYoj()>2015)
.map(Employee1::getName)
.toList();
System.out.println(results4);

// Count the number of employees in each department?

Map<String,Long> results5=employeedetails.stream()
.collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.counting()));
System.out.println(results5);








	}

}
