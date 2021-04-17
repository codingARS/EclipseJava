//The java.util.Scanner.skip(String pattern) method skips input that matches a pattern 
//constructed from the specified string.An invocation of this method of the form skip(pattern) 
//behaves in exactly the same way as the invocation skip(Pattern.compile(pattern)).
//This method returns this scanner
package userInput;
import java.util.*;
public class ScannerSkipMethod {

	 public static void main(String[] args) {

	      String s = "Hello World! 3 + 3.0 = 6.0 true ";

	      // create a new scanner with the specified String Object
	      Scanner scanner = new Scanner(s);

	      // skip the word "Hello"
	      scanner.skip("Hello");

	      // print a line of the scanner
	      System.out.println("" + scanner.nextLine());

	      // close the scanner
	      scanner.close();
	   }
	
}
