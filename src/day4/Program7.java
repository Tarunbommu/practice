package day4;
import java.util.Iterator;
//import java.util.*;
import java.util.LinkedList;

public class Program7 {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addLast(5);
		System.out.println(list);
		
		LinkedList<Double> list1=new LinkedList<>();
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			double data=sc.nextDouble();
//			list1.add(data);
//		}
		for(int i:list) {
			double num=i;
			list1.add(num);
		}
		
		Iterator<Integer> it=list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
		System.out.println(list1);
		

	}

}
