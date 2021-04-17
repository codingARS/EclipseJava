package ConditionalStatements;

public class SwitchStatements {

	public static void main(String[] args) {
		int dayofweek=1;
	switch(dayofweek) {
	case 1:
	case 2:	
		System.out.println("I'm on leave");
		break;
	
	case 3:
		System.out.println("football");
		break;
		
		default:
			System.out.println("I don't know");
	}
	}
}
