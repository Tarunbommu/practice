package practice;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the index:");
		int b=sc.nextInt();
		if(b<0 && b>n) {
			System.out.println("Indeex invalid");
		}
		
		System.out.println("Enter the array:");
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			 a[i]=sc.nextInt();
		}
		System.out.println("The array is:");
		for(int i=0; i<n;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("Copy array");
		int na[]=new int[a.length];
		for(int i=0; i<a.length;i++) {
			na[i]=a[i];
		}
//		for(int i=0; i<a.length;i++) {
//			System.out.println(na[i]);
//		}
		System.out.println("The new array");

		  for (int i =b; i <a.length - 1; i++) {
             na[i] = na[i + 1];
          }
        n--;
		for(int i=0;i<a.length;i++) {
			System.out.println(na[i]);
		}
		
		++n;
		System.out.println("Size after increase "+n);
		for(int i=0; i<n;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enter the element to Search:");
		int s=sc.nextInt();
		
	    int index = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == s) {
                index = i;
                break;
            }
        }
 
        if (index != -1) {
            System.out.println(s + " found at index " + index);
        } else {
            System.out.println("Element " + s + " not found in the array");
        }
 
		


	}

}
