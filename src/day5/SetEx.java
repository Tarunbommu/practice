package day5;

import java.util.HashSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> list=new HashSet<>();
		list.add(null);
		list.add(10);
		list.add(23);
		list.add(10);
		list.add(null);
		
		System.out.println(list);
		
		list.remove(Integer.valueOf(10));
		
		System.out.println(list);
		
		

	}

}
