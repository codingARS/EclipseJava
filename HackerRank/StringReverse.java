package HackerRank;
import java.io.*;
import java.util.*;
public class StringReverse {

	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B="";
	        int x=A.length()-1;
	        while(x>=0){
	            B = B + A.charAt(x);
	            x--;    
	        }
	        if(B.equals(A))System.out.println("Yes");
	        else System.out.println("No");        
	    }
	}
