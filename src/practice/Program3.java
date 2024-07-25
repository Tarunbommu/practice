package practice;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
	public int binarySearch(int[] a , int lower,int upper,int s) {
		if(upper>=lower) {
			int mid = lower+(upper-lower)/2;
			if(a[mid] == s) {
				return mid;
			}
			else if(a[mid]<s) {
				return binarySearch(a,mid+1,upper,s);
			}
			else {
				return binarySearch(a,lower,mid-1,s);
			}
		}
		return -1;
	}
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
		Arrays.sort(a);

		System.out.println("Enter the element to Search:");
		int s=sc.nextInt();
		Program3 b = new Program3();
		int value_index = b.binarySearch(a, 0, n, s);
		if(value_index != -1) {
			System.out.println("Element found at index of "+ value_index);
		}
		else {
			System.out.println("Not found");
		}
		
	}
}
		