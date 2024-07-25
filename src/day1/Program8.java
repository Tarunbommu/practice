package day1;
import java.util.Scanner;
public class Program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Name:");
		String ch=sc.nextLine();
		System.out.println("Enter the last name:");
		String a=sc.nextLine();
		System.out.println("Enter the Gender (F/M): ");
		String b=sc.nextLine();
		System.out.println("Enter the age:");
		int c=sc.nextInt();
		System.out.print("Enter the Weight:");
		double d=sc.nextDouble();
		
		System.out.println("Person Details");
		System.out.println("----------------");
		System.out.println("First Name: "+ch);
		System.out.println("Last Name: "+a);
		System.out.println("Gender: "+b);
		System.out.println("Age: "+c);
		System.out.println("Weight: "+d);

	}

}
