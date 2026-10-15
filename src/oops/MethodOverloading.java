package oops;

public class MethodOverloading {
	public static void add() {
		int num1=10,num2=20;
		System.out.println("sum"+(num1+num2));
	}
	//with parameter
	public static void add(int num1,int num2) {
		int sum=num1+num2;
		System.out.println("sum="+sum);
	}
	//change datatype
	public static void add(int num1,float num2) {
		float sum=num1+num2;
		System.out.println("sum"+sum);
	}
	//change order
	public static void add(float num1,int num2) {
		float sum=num1+num2;
		System.out.println("sum"+sum);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		add(20,30);
		add(20,25.5f);

	}

}
