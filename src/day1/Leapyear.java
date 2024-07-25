package day1;
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the year:");
		int n=sc.nextInt();
		
//		if((n%4 == 0) && (n%100!=0) || (n%400==0)) {
//			System.out.println("Leap year");
//		}else {
//			System.out.println("not a leap year");
//		}
		String output = ((n%4==0) && (n%100!=0) || (n%400==0))? "Leap year":"not a leap year";
		System.out.println(output);
	}

}
