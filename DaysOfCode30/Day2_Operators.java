package DaysOfCode30;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Day2_Operators {


	    // Complete the solve function below.
	    static void solve(double meal_cost, int tip_percent, int tax_percent) {

	double tip = ((double)tip_percent/100)*meal_cost;
	double tax = meal_cost*((double)tax_percent/100);
	double total_cost = meal_cost+tip+tax;
	long result = Math.round(total_cost); //Math.round returns value in 'long'


	         System.out.println(result);
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        double meal_cost = scanner.nextDouble();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tip_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        int tax_percent = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        solve(meal_cost, tip_percent, tax_percent);


	        scanner.close();
	       
	    }
	}


