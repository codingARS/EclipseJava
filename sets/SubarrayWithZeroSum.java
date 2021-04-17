package sets;
import java.util.*;
//GIven an array, find if there exists a subarray with sum equals to zero. n< 10^5

public class SubarrayWithZeroSum {

	public static void main(String[] args) {

//		//Brute-force approach
//		int[] a = {2, 1, 3, -1, 4, -6};
//		boolean found = false;
//		
//		for(int i=0; i<a.length; i++) {
//			int sum = 0;
//			for(int j=i; j<a.length; j++) {
//				sum+= a[j];
//				if(sum==0) {
//					found = true;
//					break;
//				}
//			}
//			if(found) break;
//		}
//		System.out.println("found " + found);
		
		//Using Set
		int[] a = {2, 1, 3, -1, 4, -6};
		
		//Special Case: If sum of subarray is k
		int k = 3;
		boolean found = false;
		
		Set<Integer> set = new HashSet<>();
		int sum = 0;
		for(int element : a) {
			set.add(sum);
			sum += element; //cumulative sum
//			if(set.contains(sum)) {
			if(set.contains(sum-k)) { //Special Case
				found = true;
				break;
			}
		}
		
		System.out.println("found " + found);
		
	}
}
