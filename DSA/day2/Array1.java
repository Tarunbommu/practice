package day2;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		int[] a= {3,2,4,7,1,2,4,8,3,1,4,2,3};
		Arrays.sort(a);
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}

	}

}
