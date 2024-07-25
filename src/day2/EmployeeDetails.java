package day2;

import java.util.*;

 class EmployeeDetails {
	private String name;
	private String id;
	private double sal;
	
	public EmployeeDetails( String name, String id, double sal ) {
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName(String name) {
		return this.name;
	}
	public void setId(String id) {
		this.id=id;
	}
	public String getId(String id) {
		return this.id;
	}
	public void setSal(double sal) {
		this.sal=sal;
	}
	public Double getSal(double sal) {
		return this.sal;
	}
class DepartmentDetails extends EmployeeDetails{
		private String depName;
		private String depId;
		
		public DepartmentDetails( String name, String id, double sal, String depName, String depId ) {
			super(name, id, sal);
			this.depName=depName;
			this.depId=depId;
		}
		
		public void setDepName(String depName) {
			this.depName=depName;
		}
		public String getDepName(String depName) {
			return this.depName;
		}
		public void setDepId(String depId) {
			this.depId=depId;
		}
		public String getDepId(String depId) {
			return this.depId;
		}
@Override
		public String toString() {
			return " " +this.depName +"  "+this.depId +" "+ super.getName()+" "+super.getId()+" "+super.getSal();
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the id:");
			String id=sc.nextLine();
			
			System.out.println("Enter the Employee name:");
			String name=sc.nextLine();
			
			System.out.println("Enter the Salary:");
			double sal=sc.nextDouble();
			
			System.out.println("Enter the department id:");
			String depId=sc.nextLine();
			
			System.out.println("Enter the department name:");
			String depName=sc.nextLine();
			
			DepartmentDetails emp=new DepartmentDetails();
		}
}}
