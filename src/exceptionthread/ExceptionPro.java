package exceptionthread;

public class ExceptionPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(a/0);
		try {
			System.out.println(a/0);
		}
		//catch(ArithmeticException e1) {
			//System.out.println(e1);
		//}
		//catch(IndexOutOfBoundsException e2) {
		//	System.out.println(e2);
		//}
		//catch(Exception e) {
			//System.out.println(e);
			
		//}
		finally {
			System.out.println("hello");
		}

	}


}
