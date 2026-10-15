package exceptionthread;

public class ArithmaticException {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(a/0);
		try {
			System.out.println(a/0);
		}
		catch(Exception e) {
			System.out.println(e);
			
	}
		System.out.println("hello");

	}

}
