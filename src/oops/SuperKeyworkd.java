package oops;
class Superclass {
	public void SuperClass() {
	String name="anu";
	System.out.println(name);
}
public void SuperClass(String name) {
	System.out.println(name);
}
}
public class SuperKeyworkd extends SuperClass{
	public void SuperKeyword() {
		super.("arun");
		String name="anupama";
		System.out.println(name);
		
	}

public class SuperKey {
	public static void main(String arg[]) {
		SuperKeyword ob=new SuperKeyword();
		
		
	}
}

}
