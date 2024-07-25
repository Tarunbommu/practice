package day4;

import java.util.LinkedList;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<>();
		list.add("Tarun");
		list.add("Kumar");
		list.add("Loki");
		list.add("Sowmya");
		list.addLast("Nikhlia");
		LinkedList<String> list1=new LinkedList<>(list);
		System.out.println(list);
		list.remove("Loki");
		list.remove(1);
		list.removeLast();
		list.removeFirst();
		System.out.println(list);
		LinkedList<String> list2=new LinkedList<>(list);
		System.out.println(list1);
		System.out.println(list2);

		

	}

}
