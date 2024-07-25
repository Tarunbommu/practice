package day3;
import java.util.regex.*;
import java.util.*;
final class RegularExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		String ch=sc.nextLine();
		
//		System.out.println("Enter the name:");
//		String s1=sc.nextLine();
		
		Pattern p= Pattern.compile("^[1-9]{1}+[0-9]{9}+$");
		Matcher m= p.matcher(ch);
		
//		System.out.println(m.matches());
		
//		boolean res= Pattern.matches("^[a-zA-Z0-9\\._]+@[a-z]+\\.[a-z]+$", ch);
		
//		System.out.println(res);
		
		
//		Matcher m1= p.matcher(s1);
		
//		System.out.println(m1.matches());
		System.out.println(m.matches());
		
//		boolean res= Pattern.matches("^[a-zA-Z0-9\\._]+@[a-z]+\\.[a-z]+$", ch);
		
//		System.out.println(res);
		sc.close();
	}

}
