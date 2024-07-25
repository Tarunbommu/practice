package day5;

import java.util.LinkedHashSet;

public class LinkHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> list=new LinkedHashSet<>();
//		list.add(null);
		list.add(10);
		list.add(23);
		list.add(10);
//		list.add(null);
		list.add(11);

		for(int i:list) {
		System.out.println(i);
		}
		System.out.print(list);
		
//		list.remove(Integer.valueOf(10));
		
//		System.out.println(list);

	}

}
