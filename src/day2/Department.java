package day2;

import java.util.Scanner;

public class Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		String Id=sc.nextLine();
		
		System.out.println("Enter the Employee name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the Salary:");
		double sal=sc.nextDouble();
		
		System.out.println("----------------");
		Employee emp =new Employee();
		emp.Employee(Id, name, sal);
    	emp.employeeList();
		
		System.out.println(emp.getName());


	}

}
