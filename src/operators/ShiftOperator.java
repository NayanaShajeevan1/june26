package operators;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=2,y=2;
		System.out.println("2==>"+Integer.toBinaryString(x));
		System.out.println("-2==>"+Integer.toBinaryString(y));
		
		System.out.println("leftshift=2"+(x<<2));
		System.out.println(Integer.toBinaryString(x<<2));
		
		System.out.println("rightshift=2"+(x>>1));
		System.out.println(Integer.toBinaryString(x>>1));
		
		System.out.println("unsigned rightshift=2"+(x>>>1));
		System.out.println(Integer.toBinaryString(x>>>1));
		
		System.out.println("leftshift=-2"+(y<<2));
		System.out.println(Integer.toBinaryString(y<<2));
		
		System.out.println("rightshift=-2"+(y>>1));
		System.out.println(Integer.toBinaryString(y>>1));
		
		System.out.println("unsigned rightshift=2"+(y>>>1));
		System.out.println(Integer.toBinaryString(y>>>1));









	}

}
