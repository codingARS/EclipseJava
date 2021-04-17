package ConditionalStatements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("eenter first no.");
		int a=sc.nextInt();
		
		System.out.println("enter second no");
		int b=sc.nextInt();
		
		System.out.println("enter the operation");
		sc.nextLine();
		//because we have taken int values input before, so nextLine() is used 2times to input string twice
		char operation=sc.nextLine().charAt(0);
		
	int result=0;
		
		switch(operation) {
		case'+':
			result=a+b;
			break;
		case'-':
			result=a-b;
			break;
		case'*':
			result=a*b;
			break;
		case'/':
			result=a/b;
			break;
		default:
			System.out.println("invalid");
		
		}
		System.out.println("the result is" +result);
		
		}
		
	}