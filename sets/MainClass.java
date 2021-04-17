package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {

////		Set<String> fruits = new HashSet<>();  //uses HashMap
//		Set<String> fruits = new LinkedHashSet<>(); //uses Linkedlist
//		
//		fruits.add("Apple");
//		fruits.add("Banana");
//		
//		System.out.println(fruits.add("Kiwi"));
//		
//		System.out.println(fruits.add("Banana"));
//		
//		System.out.println(fruits);
		
		Set<Integer> x = new HashSet<>();
		x.add(1);
		x.add(2);
		x.add(3);
		
		Set<Integer> y = new HashSet<>();
		y.add(1);
		y.add(7);
		y.add(8);
		y.add(9);
		
//		x.addAll(y);
		x.retainAll(y);
		
		System.out.println(x.containsAll(y)); //if y is a subset of x
		
		System.out.println(x);
		
		
	}

}
