package day3;
import java.util.*;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num= {1,2,3,4,5,6,7};//array literal
		
//		int num1[]=new int[5];
//		num1[0]=1;
//		num1[1]=2;
//		num1[2]=3;
//		num1[3]=4;
//		num1[4]=5;
		
//		for(int i:num) {
//		System.out.println(i+"");
//		}
		
//		System.out.println(num.length);
		
//		for(int j:num1) {
//		System.out.println(j+"");
//		}
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		
		int num[] = new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();	
		}
		System.out.println("The array: ");
//		for(int i=0;i<n;i++) {
//			System.out.println(num[i]);	
//		}
//		System.out.println("The reverse array: ");	
//		for(int i=n-1;i>=0;i--) {
//			System.out.println(num[i]);
//		}
		
		for(int i=0, j=n-1; i<n,j>=0;i++ , j--) {
			
			System.out.println(num[i]+" "+num[j]);
			
		}
		
		
	}

}
