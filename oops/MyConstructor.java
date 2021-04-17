package oops;

class Vehicle {
	int wheels;
	int headlights;
	String color;
	
//	Vehicle(int noOfWheels) { //Parameterised Consructors
//		wheels = noOfWheels;
//		headlights = 2;
//		
//	}
	
	//using 'this' keyword, if you want to call constructor with the same name
	
    Vehicle(int wheels) {
    	this.wheels = wheels; //this keyword refers to the current object made
    	headlights = 2;
    	
    }
    
    Vehicle(int wheels, String color) {
    	this.wheels=wheels;
    	this.color=color;
    	headlights=4;
    }
    
//    Vehicle() {
//    	
//    }

}

public class MyConstructor {
	
	MyConstructor() {
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
       
//		MyConstructor obj = new MyConstructor();
		
		Vehicle car = new Vehicle(4);
		Vehicle scooter = new Vehicle(2);
		
		Vehicle eRickshaw= new Vehicle(3, "Yellow");
		
	//	Vehicle random=  new Vehicle(); //you cannot call a default constructor after defing constructor(s) of a class
		        //if you still want to call a default constructor, then you have to make one yourself(as in commented line28 )
		
		System.out.println(eRickshaw.wheels +" wheels & color is "+ eRickshaw.color);
		System.out.println(car.wheels +" wheels");
		System.out.println(scooter.wheels +" wheels");
	}

}
