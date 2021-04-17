//QUESION: Series is (a + 2^0.b),(a + 2^0.b + 2^1.b).....(a+.....+2^n-1.b)
//For each query, print the corresponding series on a new line. Each series must be printed 
//     in order as a single line of  space-separated integers.
//Sample Input
//2
//0 2 10
//5 3 5
//
//Sample Output
//2 6 14 30 62 126 254 510 1022 2046
//8 14 26 50 98

package HackerRank;

import java.util.*;
import java.io.*;
public class JavaLoops2 {


	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	         
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	        
	        int s=0;
	         for(int j=0,k=0;j<n && k<=n-1;j++,k++){  //two-level nested 'for' loop
	            s=(int)Math.pow(2,k)*b + s;     //typecasted because Math.pow returns value in 'double'
	             System.out.print(a+s+" ");
	    } 
	    System.out.println();
	    }
	    in.close();
	}
	}

	
