package day5;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		PriorityQueue<Character> pq= new PriorityQueue<>();
		ArrayDeque<Character> pq= new ArrayDeque<>();

		pq.add('A');
		pq.offer('c');
		pq.offer('b');
		pq.offer('E');
		pq.offerFirst('W');
		pq.offerLast('s');
		
		System.out.println(pq);
		
//		pq.remove();
		
//		System.out.println(pq);
		
		pq.poll();
		pq.pollFirst();
		pq.pollLast();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
	}

}
