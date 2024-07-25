package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter the array:");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		System.out.println("The array is:");
		for(int i=0; i<n;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Enter the element to Search:");
		int s=sc.nextInt();
		
		int index = Arrays.binarySearch(a, s);

        if (index >= 0) {
            System.out.println("Element found is: " + a[index]);
        } else {
            System.out.println("Element not found");
        }
		
	}

}
