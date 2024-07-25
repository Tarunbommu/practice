package day5;

import java.util.Scanner;

public class TestCases{
	int a;
	int b;
	
	
	public static void main(String[] args) {
		
		Inter add=((a,b)->(a+b));
		Inter sub=((a,b)->(a-b));
		Inter mul=((a,b)->(a*b));
		Inter div=((a,b)->(a/b));
		Inter per=((a,b)->(a%b));
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();	
		System.out.println("Enter the choice:");
		int c=sc.nextInt();
		
		TestCases tc1= new TestCases();
		
		switch(c){
		case 1:
			tc1.oper(a, b, add);
			break;
		case 2:
			tc1.oper(a, b, sub);
			break;
		case 3:
			tc1.oper(a, b, mul);
			break;
		case 4:
			tc1.oper(a, b, div);
			break;
		case 5:
			tc1.oper(a, b, per);
			break;
		default:
			System.out.println("invalid choice");
		}
		
	}
	
	public void oper(int a, int b, Inter obj) {
		int result=obj.oper(a,b);
		System.out.println(result);
	}

}
