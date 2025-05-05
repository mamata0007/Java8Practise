package Java8_Program;

public class Employee1 {

private int id;
private String name;
private int age;
private String department;
private String gender;
private int yoj;
private double salary;
public Employee1(int id, String name, int age, String department, String gender, int yoj, double salary) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.department = department;
	this.gender = gender;
	this.yoj = yoj;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getYoj() {
	return yoj;
}
public void setYoj(int yoj) {
	this.yoj = yoj;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", department=" + department + ", gender="
			+ gender + ", yoj=" + yoj + ", salary=" + salary + "]";
}



	}


