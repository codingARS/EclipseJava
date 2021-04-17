//Whenever you perform a mathematical operation on two values that aren’t of the same type, Java automatically converts one of them to the type of the other. Here are the rules Java follows when doing this conversion:
//If one of the values is a double, the other value is converted to a double.
//If neither is a double but one is a float, the other is converted to a float.
//If neither is a double nor a float but one is a long, the other is converted to a long.
//If all else fails, both values are converted to int.
package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
//       int x = 4;
//       double y =x;
//       System.out.println(y);
//       System.out.println(x);
		
		double myDouble = 2.8262;
		int myInt = (int)myDouble;
		System.out.println(myDouble);
		System.out.println(myInt);		}

}
