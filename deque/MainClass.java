package deque;

import java.util.ArrayDeque;

public class MainClass {

	public static void main(String[] args) {
 
		ArrayDeque<Integer> ad = new ArrayDeque<>();
		
//ArrayDeque as queue		
//		ad.addFirst(12);
//		ad.addFirst(23);
//		
//		ad.pop();
//		System.out.println(ad.peek());
		
		//Arraydeque as stack
		ad.push(12);
		ad.push(23);
		ad.push(34);
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
		}

}
