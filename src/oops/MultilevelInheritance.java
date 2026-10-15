package oops;
class Animal{
	String color;
	public void eat() {
		System.out.println("Animal is eating....");
	}
}
class Dog extends Animal{
	String breed="pug";
			public void bark() {
				System.out.println("Dog is barking...");
			}
}
class Puppy extends Dog{
	int age=1;
	public void play() {
		System.out.println("puppy is playing");
	}
	
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puppy ob=new Puppy();
		System.out.println("color="+(ob.color="black"));
		System.out.println(" breed="+(ob.breed));
		System.out.println("age="+(ob.age));
		ob.eat();
		ob.bark();
		ob.play();

		

	}

}
