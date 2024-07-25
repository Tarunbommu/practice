package day1;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println(loc);
//		String s=" Tarun kumar ";
//		String comp=s;
//		System.out.println(s);
//		
//		s="kumar";
//		System.out.println(s);
//		String s1= new String("Engineer");
//		String loc=new String("Hello!");
//		System.out.println(s1);
		
		//String operations
//		System.out.println(s.toUpperCase());
//		System.out.println(s.toLowerCase());
//		System.out.println(s.trim());
//		System.out.println(s.charAt(1));
//		System.out.println(s.indexOf('a',5));
//		System.out.println(s.indexOf("Tarun"));
//		System.out.println(s.replace("kumar", "Bommu"));
		
		System.out.println("Enter the senetence:");
		String ch = sc.nextLine();
		
		System.out.println("Enter the word to search");
		String search=sc.nextLine();
		
		System.out.println("Enter the word to replace");
		String replac=sc.nextLine();
		
		System.out.println("senetence: "+ch);
		
		boolean condition = ch.contains(search);
		if(condition) {
			System.out.println("search: "+ch);
			
		}else {
			System.out.println(ch+"( no such word)");
		}
		
		System.out.println("replace: "+ch.replace(search, replac));

	}

}
