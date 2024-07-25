package day2;
import java.util.*;
public class Employee {
	private String Id;
	private String name;
	double sal;
	
	public Employee(String Id, String name, double sal ) {
		this.name=name;
		this.Id=Id;
		this.sal=sal;
	}
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return this.name;
	}
	public void employeeList( ) {

		System.out.println("Emp ID: "+this.Id);
		System.out.println("Emp Name: "+this.name);
		System.out.println("Emp Salary: "+this.sal);
	}

	

}
