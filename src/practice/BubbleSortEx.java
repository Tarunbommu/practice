package practice;

import java.util.Scanner;

public class BubbleSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		
		for (int i = 1; i < n; i++) {
            if (a[i - 1] > a[i]) {
                int temp = a[i - 1];
                a[i - 1] = a[i];
                a[i] = temp;
            }
		}

	}

}
