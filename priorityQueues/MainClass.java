package priorityQueues;

import java.util.PriorityQueue;

public class MainClass {

	public static void main(String[] args) {
			
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(45);
		pq.add(12);
		pq.add(1);
		pq.add(100);
		
		//the inserted order is not sorted in any way
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	
//		PriorityQueue<String> pq = new PriorityQueue<>();
//		
//		pq.add("Kiwi");
//		pq.add("Apple");
//		pq.add("Mango");
//		pq.add("Banana");
//		
//		System.out.println(pq);
//		
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
//		System.out.println(pq.remove());
	}

}
