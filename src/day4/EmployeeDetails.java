package day4;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeDetails {
	public Employee getEmployeeInfo(String str) {
//		int atIndex =str.indexOf('@');
//		String name=str.substring(0,atIndex);
//		String s[]=str.split("@");
//		String name=s[0];
		
//		int dashIndex=str.indexOf('-');
//		String ssn=str.substring(atIndex+1,dashIndex);
//		s=s[1].split("-");
//		String ssn=s[0];
		
//		s=s[1].split("#");
//		String dept=s[0];
		
//		int hashIndex = str.indexOf('#');
//	    String dept = str.substring(dashIndex + 1, hashIndex);
//		int salary = Integer.parseInt(str.substring(hashIndex + 1));
	    
//	    int sal = Integer.parseInt(s[1]);
	    
	    String str1[]=str.split("@|-|#");
	    
	    String name=str1[0];
	    String ssn=str1[1];
	    String dept=str1[2];
	    int sal = Integer.parseInt(str1[3]);
	    
	    return new Employee(name, ssn, dept, sal);

	}
	    
	    public String getEmployeeDept(Employee e) {
	    	String ssn = e.getSsn();
	    	String lastThreeDigits = ssn.substring(ssn.length() - 3);
	    	int ssnNumber = Integer.parseInt(lastThreeDigits);

	    	if (ssnNumber >= 1 && ssnNumber <= 60) {
	    	    return "L1";
	    	} else if (ssnNumber >= 61 && ssnNumber <= 120) {
	    	    return "L2";
	    	} else if (ssnNumber >= 121 && ssnNumber <= 180) {
	    	    return "L3";
	    	} else {
	    	    return "L4";
	    	}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.nextLine();
		EmployeeDetails empdet = new EmployeeDetails();

//		String input = "Amit Rai@1PC16CS046-ALU#8";
		
		Employee emp = empdet.getEmployeeInfo(input);

		
		System.out.println("Name: " + emp.getName());
		System.out.println("SSN: " + emp.getSsn());
		System.out.println("Department: " + emp.getDept());
		System.out.println("Salary: " + emp.getSal());

		String deptLevel = empdet.getEmployeeDept(emp);
		System.out.println("Department Level: " + deptLevel);

		sc.close();
}

}
