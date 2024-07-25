package day3;
import java.util.*;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array (n): ");
		int n=sc.nextInt();
//		int m=sc.nextInt();
		
		int[][] ch=new int[n][n];
		System.out.println("Enter elements for the array:");
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				ch[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array");
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(ch[i][j]+" ");
//			}
//			System.out.println();
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(ch[j][i]+" ");
//			}
//			System.out.println();
//		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 1) {
                    // Apply transformation only to the second row
                    ch[i][j] *= ch[i][j];
                } else if (i == 2 && j == 0) {
                    // Swap the first and last elements of the third row
                    int temp = ch[i][j];
                    ch[i][j] = ch[i][2];
                    ch[i][2] = temp;
                }
            }	

	}

}
