package oops;

public class FinalClass { 
	public final void display() {
		System.out.println("hello..");
	}
}
public class FinalKeyword1 extends FinalClass{
	public void display1() {
		System.out.println("java Programming");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalKeyword1 ob=new FinalKeyword1();
		ob.display();
		ob.display1();

	}

}
