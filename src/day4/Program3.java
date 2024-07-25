package day4;
import java.io.*;
import java.util.Scanner;

class DenominatorException extends Exception{
	public DenominatorException(String message) {
		super(message);
	}
}
public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			if(b==0) {
				throw new DenominatorException("Denominator is zero");
			}
			int c=a/b;
			System.out.println(c);
		}catch(DenominatorException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
	}
	}
}