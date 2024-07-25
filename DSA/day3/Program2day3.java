package day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program2day3 {
	public static void findPair(int[] a, int n, int b) {
        Set<Integer> set = new HashSet<>();
        for (int num : a) {
            set.add(num);
        }
 
        for (int num : a) {
            int target = num + b;
            if (set.contains(target)) {
                System.out.println("Pairs Found: (" + num + ", " + target + ")");
            }
        }
    }

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		
		int[] a=new int[n];
		System.out.println("Enter the Array:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the number:");
		int b=sc.nextInt();
		 findPair(a, n, b);


	}

}
