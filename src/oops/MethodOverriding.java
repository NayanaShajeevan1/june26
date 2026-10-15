package oops;
class Birds{
	public void sound() {
		System.out.println("tweet...tweet");
	}
}

class Duck extends Birds{
		public void sound() {
			System.out.println("quakk..quakk");
		}
		
	}


public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d=new Duck();
		d.sound();
		//Birds b=new Duck();

	}

}
