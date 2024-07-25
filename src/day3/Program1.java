package day3;
import java.util.*;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Sentence:");
		String sen=sc.nextLine();
		String encrypted= encrypt(sen);
		

		}
		public static String encrypt(String sen) {
			
			String encrypted = "";
			
			for(int i=0;i<=sen.length(); i++) {
				char ch=sen.charAt(i);
				
				if (Character.isLowerCase(ch)) {
	                // Shift character by 3 positions in the alphabet
	                char shifted = (char) ('a' + (ch - 'a' + 3) % 26);
	                encrypted += shifted;
	            } else if (Character.isUpperCase(ch)) {
	                // Shift character by 3 positions in the alphabet
	                char shifted = (char) ('A' + (ch - 'A' + 3) % 26);
	                encrypted += shifted;
	            } else {
	                // Non-alphabetic character, append as-is
	                encrypted += ch;
	            }
		}
			return encrypted;
		}
}

