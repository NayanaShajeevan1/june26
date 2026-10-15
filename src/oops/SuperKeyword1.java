package oops;
class Superclass1{
	public void display() {
		String name="anu";
		System.out.println(name);

	}
}
class Superkeyword1 extends Superclass{
	public void display() {
		String name="anupama";
		super.display();
		System.out.println(name);

	}



public class SuperKeyword1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeyword1 key=new Superkeyword1();
		key.display();
		
	}
	}

}
