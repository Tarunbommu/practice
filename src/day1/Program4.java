package day1;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("1 is ur choice");
			break;
		case 2:
			System.out.println("2 is ur choice");
			break;
		default:
			System.out.println("default");
			break;
		}

	}

}
