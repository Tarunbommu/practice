package day4;

public class Employee {
		private String name;
		private String ssn;
		private String dept;
		private int sal;
		public Employee(String name, String ssn, String dept, int sal) {
			this.name=name;
			this.ssn=ssn;
			this.dept=dept;
			this.sal=sal;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setSsn(String ssn) {
			this.ssn =ssn;
		}
		public String getSsn() {
			return ssn;
		}
		public void setDept(String dept) {
			this.dept =dept;
		}
		public String getDept() {
			return dept;
		}
		public void setSal(int sal) {
			this.sal =sal;
		}
		public int getSal() {
			return sal;
		}
		
	}
