package oops;

abstract class Vehicle{
	public abstract void start();
	public void sound() {
		System.out.println("beep..beep..");
	}
}
class Bike extends Vehicle{
	public void start() {
		System.out.println("kick start");
	}
}
class Train extends Vehicle{
	public void start() {
		System.out.println("button start");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.start();
		b.sound();
		
		Vehicle v=new Train();
		v.sound();
		v.start();
		

	}

}
