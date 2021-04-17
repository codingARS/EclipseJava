package oops.ExceptionHandling;

public class MainClass {
  public static void main(String[]args) {
	
	  try {
//	  int a=5;
//	  int b=0;
//	  
//	  int c=a/b;
//	  
//    System.out.println(c);
		  
		  int a[] = new int[5];
		  System.out.println(a[6]);
		  
	  } catch(ArithmeticException e) {
		  System.out.println(e.getMessage() + " occured, please check your code.");
	  } catch(ArrayIndexOutOfBoundsException e) {
		  System.out.println("index should be in the range of 0 to the size of array");
	  } catch(IllegalArgumentException e) {
		  System.out.println("check your casting carefully");
	  } finally {
		  System.out.println("Sorry for the inconvienience.");
	  }
	  System.out.println("very important code");
	  System.out.println("need to run");
//	  fun1();
  }
  static void fun1() {
	  int a=5;
	  int b=0;
	  
	  int c=a/b;
	  
    System.out.println(c);
  }
	
}
