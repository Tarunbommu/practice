package day3;

import java.util.Scanner;

public class Program1Day3 {

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
		int largest = 0;
        int secondLargest = -1;
 
        for (int i = 1; i < n; i++) {
            if (a[i] > a[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (a[i] > a[secondLargest] && a[i] != a[largest]) {
                secondLargest = i;
            }
        }
 
        if (secondLargest != -1) {
            System.out.println("The second largest element is " + a[secondLargest]);
        } else {
            System.out.println("There is no second largest element.");
        }
	}

}
