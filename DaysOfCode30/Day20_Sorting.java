package DaysOfCode30;
import java.util.*;
public class Day20_Sorting {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        int temp=0;
	        int swaps=0;
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = sc.nextInt();
	        }

	        for(int i=0; i<n; i++){  
	            for(int j=0; j<n-1; j++){
	                if(a[j]>a[j+1]){
	                    temp=a[j];
	                    a[j]=a[j+1];
	                    a[j+1]=temp;
	                    swaps++;
	                }
	            }   
	        }
	        if(swaps==0) System.out.println("Array is sorted in "+ swaps +" swaps.");
	        else System.out.println("Array is sorted in "+ swaps  +" swaps.");

	        System.out.println("First Element: "+ a[0]);
	        System.out.println("Last Element: "+ a[n-1]);
	        
	        sc.close();
	    }
	}