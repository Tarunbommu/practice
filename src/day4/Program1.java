package day4;
import java.io.*;
import java.util.Scanner; 
public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt()
;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println(e);
			
		}
		catch(Exception e){
			System.out.println(e);
			
		}
//		catch(ArithmeticException e){ do not define like this 
//			System.out.println(e);
			
//		}
		System.out.println(a+" "+b);
		sc.close();
	}

}
