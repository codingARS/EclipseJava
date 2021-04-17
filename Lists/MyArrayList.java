package Lists;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {

		List<String> fruits = new ArrayList();
		List<String> vegetables = new ArrayList();
		
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Hi");
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
		
//		fruits.clear() ;
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("Apple");
//		toRemove.add("Hi");
		
//		fruits.removeAll(toRemove);
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		
		fruits.addAll(vegetables);
		fruits.set(1, "Banana");
		fruits.remove(2);
		
		
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		System.out.println(fruits.size());
		System.out.println(fruits.contains("Guava"));
		System.out.println(fruits.isEmpty());
		
		
//		ArrayList<Integer> marks = new Arraylist();
		
//		Pair<String, Integer> p1 = new Pair("Anuj", 47);
//		Pair<Boolean,String> p2 = new Pair(true, "HelloJi");
//		
//		p1.getDescription();
//		p2.getDescription();
	}

}
