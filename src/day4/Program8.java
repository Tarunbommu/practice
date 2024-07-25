package day4;

import java.util.Stack;

public class Program8 {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.add(30);
		s.push(23);
		s.push(34);
		s.add(45);
		
		System.out.println(s);
		System.out.println(s.peek());
		
		s.remove(Integer.valueOf(23));
		
		s.pop();
		System.out.println(s);
		System.out.println(s.peek()); 
		

	}

}
