package PriorityQueue;

import java.util.*;

public class pq_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		P_Queue_G18<String> pq=new P_Queue_G18<>();
//		pq.enque(10,"abc");
//		System.out.println(pq);
//		pq.enque(1,"def");
//		pq.enque(5, "ghi");
//		System.out.println(pq);
//		System.out.println(pq.deque());
//		System.out.println(pq.peek());
//		System.out.println(pq);
		
		PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.add(5);
		pq.add(3);
		pq.add(10);
		pq.add(1);
		
		while(pq.size()!=0) {
			System.out.println(pq.poll());
		}
		
	}

}
