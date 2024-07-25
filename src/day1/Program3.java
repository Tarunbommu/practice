package day1;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int a=sc.nextInt();
		System.out.println("Enter the nationality:(true/flase)");
		boolean b=sc.nextBoolean();
		System.out.println("Enter the voter:(true/flase)");
		boolean c= sc.nextBoolean();
		if(a>18) {
			if(b) {
					if(c) {
						System.out.println("you can vote");
					}else {
						System.out.println("Get the vote");
					}
			}else {
				System.out.println("Your are not indian");
			}
		}else {
			System.out.println("Your are minor");
		}
}
}
	
	