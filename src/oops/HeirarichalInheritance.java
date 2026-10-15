package oops;
class Birds{
	String color;
	public void eat() {
		System.out.println("Bird is eating....");
	}
}
class Crow extends Birds{
	String sound;
			public void flying() {
				System.out.println("Bird  is flying...");
			}
}
class Parrot extends Birds{
	int age=1;
	public void sleep() {
		System.out.println("Bird is sleeping");
	}
	

}

public class HeirarichalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Crow ob=new Crow();
		System.out.println("crow color:"+(ob.color="black"));
		System.out.println("crow sound:"+(ob.sound="craa..."));
		ob.eat();
		ob.flying();
		Parrot ob1=new Parrot();
		System.out.println("parrot color:"+(ob1.color="green"));
		System.out.println("parrot age:"+(ob1.age));
		ob1.eat();
		ob1.sleep();


	}

}
