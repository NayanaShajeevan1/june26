package oops;
class Superclass{
	String name="anu";
}
class Superkeyword extends Superclass{
	String name="anupama";

  public void display() {
	System.out.println(super.name);
	System.out.println(name);
}
	
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Superkeyword key=new Superkeyword();
		key.display();

	}

}
