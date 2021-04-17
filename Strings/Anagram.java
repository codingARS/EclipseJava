package Strings;

public class Anagram {

	public static void main(String[] args) {
           
		String a="aab@#123";
		String b="baa123#@ ";
		
		boolean isAnagram=true;
		
		
//      TIME COMPLEXITY OF THIS METHOD IS O(n^2)
		
//		boolean is Anagram=false;
//		boolean visited[]=new boolean[b.length()];
//		
//		if(a.length()==b.length()) {
//		
//		for(int i=0; i<a.length(); i++) {
//			char c=a.charAt(i);
//			isAnagram=false;
//			for(int j=0; j<b.length(); j++) {
//				if(b.charAt(j)==c && !visited[j]) {
//					visited[j]=true;
//					isAnagram=true;
//					break;
//				}
//			}
//			if(!isAnagram) {
//				break;
//			}
//		} }
		
//      BY USING 2 ARRAYS
//		int al[]= new int[256];
//		int bl[]= new int[256];
//		
//		for(char c: a.toCharArray()) {
//		        int index=(int) c;
//		        al[index]++;
//		
//		}
//		for(char c: b.toCharArray()) {
//	        int index=(int) c;
//	        bl[index]++;
//	
//	}
//		for(int i=0; i<256; i++) {
//			if(al[i]!=bl[i]) {
//				isAnagram=false;
//				break;
//			}
//		}
		
//      BY USING 1 ARRAY ONLY		
		int al[]= new int[256];
				
		for(char c: a.toCharArray()) {
		        int index=(int) c;
		        al[index]++;
		
		}
		for(char c: b.toCharArray()) {
	        int index=(int) c;
	        al[index]--;
	
	}
		for(int i=0; i<256; i++) {
			if(al[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		
		if(isAnagram) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}
} 