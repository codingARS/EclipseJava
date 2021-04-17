package linkedLists;
import java.util.*;
public class NewLinkedList {

	public static void main(String[] args) {

		MyLinkedList<String> myLL = new MyLinkedList();
		
		for(int i=0; i<10; i++) {
			myLL.add(i+"added ");
		}
		
//		myLL.add(12);
//		myLL.add(56);
		
		myLL.print();
		
	}

}
