package Java8_Program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class EmployeewithhighestSalary {

	private int id;
	private String Name;
	private double Salary;
	
	public EmployeewithhighestSalary(int id,String name,double Salary) {
		this.id=id;
		this.Name=name;
		this.Salary=Salary;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return Name;
	}
	public double getSalary() {
		return Salary;
	}
	@Override
	public String toString() {
		return "{id="+id+"name="+Name+"salary="+Salary+"}";
		
	}
	
}
