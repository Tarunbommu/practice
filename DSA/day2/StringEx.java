package day2;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the N value:");
		int n=sc.nextInt();
		
		System.out.println("Enter the element:");
		String c=sc.next();
		char d = c.charAt(0);
		
		String a="abcab";
		int s=5;
		StringBuilder e= new StringBuilder();
		
		for(int i=0;i<n;i++) {
			e.append(a);
		}
	      int totalLength = e.length();
	        for (int i = 0; i < totalLength; i += s * a.length()) {
	            int endIndex = Math.min(i + s * a.length(), totalLength);
	            System.out.println(e.substring(i, endIndex));
	        }
	        long count = e.chars().filter(ch -> ch == d).count();
	        System.out.println("Number of occurrences of "+d +" : " + count);
		
		
	}

}
