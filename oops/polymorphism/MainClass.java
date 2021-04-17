package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
       
		Dog d = new Dog();
		
		Pet p = d;
//		Animal a = d;
//		
//		d.walk();
//		p.walk(); //runtime polymorphism
		
		//greetings("Good morning", 5); //compile time polymorphism
		
		System.out.println(p.name);
		System.out.println(d.name);//variables never overrite only methods overrite
		
		
	}
	
	public static void greeting() {
		System.out.println("Hi there");
	}

	public static void greeting(String s) {
		System.out.println(s);
			}
	
	public static void greeting(String s, int count) {
		for(int i=0; i<count; i++) {
			System.out.println(s);
		}
	}
}
