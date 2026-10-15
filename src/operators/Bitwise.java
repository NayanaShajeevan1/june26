package operators;

public class Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=15,n2=16;
		System.out.println("n1=15:"+Integer.toBinaryString(n1));
		System.out.println("n2=15:"+Integer.toBinaryString(n2));
		System.out.println("Bitwise AND:15&16="+(n1&n2));
		System.out.println("15&16:"+Integer.toBinaryString(n1&n2));
		
		System.out.println("Bitwise OR:15|16="+(n1|n2));
		System.out.println("15|16:"+Integer.toBinaryString(n1|n2));
		
		System.out.println("Bitwise XOR:15^16="+(n1^n2));
		System.out.println("15^16:"+Integer.toBinaryString(n1^n2));
		
		System.out.println("Bitwise COMPLIMENT:~15="+(~n1));
		System.out.println("~15:"+Integer.toBinaryString(~n1));
		
		System.out.println("Bitwise COMPLIMENT:~16="+(~n2));
		System.out.println("~16:"+Integer.toBinaryString(~n2));









	}

}
