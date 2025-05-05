package Java8_Program;

public class Employee {
	private int Id;
	private String name;
	private int age;
	private int Salary;
	public Employee(int id, String name, int age, int salary) {
		this.Id = id;
		this.name = name;
		this.age = age;
		this.Salary = salary;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		this.Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", age=" + age + ", Salary=" + Salary + "]";
	}
	
	

}
