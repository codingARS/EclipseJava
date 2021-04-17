//Task:  Given a base-10 integer,n, convert it to binary (base-2). Then find and print the base-10 integer
//denoting the maximum number of consecutive 1's in n's binary representation.
//Sample Input 1
//5
//Sample Output 1
//1
//Sample Input 2
//13
//Sample Output 2
//2
//E.g 1001 has max 1 consecutive 1's; 11001101 has mAX 2 consecutive 1's; 111001101101 has MAX 3 consecutive 1's

package DaysOfCode30;
import java.util.*;
public class Day10_BinaryNumbers {

	    private static final Scanner scanner = new Scanner(System.in);
	    public static void main(String[] args) {
	       
	          int n = scanner.nextInt();
	          int temp=0;
	          int sum=0;
	          int ans=0;

	          while(n>0){
	              temp=n%2;
	              n=n/2;
	              if(temp==1){
	                  sum++;
	                   if(sum>=ans) ans=sum;
	                   }
	               else{
	                       sum=0;
	                   }	                
	          }             
	        System.out.println(ans);
	        scanner.close();
	    }
	}
