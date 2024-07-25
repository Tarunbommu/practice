package day6;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check the prime or not:");
		int num=sc.nextInt();
		
		 Predicate<Integer> isPrime = n -> {
	            if (n <= 1) return false;
	            if (n == 2 || n == 3) return true;
	            if (n % 2 == 0) return false;
	            for (int i = 3; i * i <= n; i += 2) {
	                if (n % i == 0) return false;
	            }
	            return true;
	        };
	        
	        Consumer<Integer> printResult = n -> {
	            if (isPrime.test(n)) {
	                System.out.println(n + " is prime.");
	            } else {
	                System.out.println(n + " is not prime.");
	            }
	        };
	        
	        printResult.accept(num);
	}

}
