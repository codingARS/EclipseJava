package oops.interfaces;

public class Person implements Student, Youtuber {

	public static void main(String[] args) {
		Person obj = new Person();
      obj.study();
	obj.makeVideo();
		
	Youtuber obj2 = obj; //Upcasting not instantiation
	obj2.editVideo();
	obj2.makeVideo();
	
	}

	@Override
	public void study() {
    System.out.println("person is studying");	
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making video");
	}

	@Override
	public void editVideo() {
        System.out.println("Youtuber is editing");		
	}

	public void uploadVideo() {
		
	}
}
