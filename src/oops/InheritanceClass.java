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

public class InheritanceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog ob=new Dog();
		System.out.println("Dog color="+(ob.color="black"));
		System.out.println("Dog breed="+(ob.breed));	
		ob.eat();
		ob.bark();

	}

}
