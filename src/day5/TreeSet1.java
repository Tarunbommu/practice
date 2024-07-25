package day5;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> list=new TreeSet<>();
		list.add(10);
		list.add(23);
		list.add(11);
		list.add(12);
		list.add(13);

		for(int i:list) {
		System.out.println(i);
		}
		System.out.print(list);
		System.out.println("\n");
		
		
		for(int i:list.descendingSet()) {
		System.out.println(i);
		}
		System.out.print(list.descendingSet());
		



	}

}
