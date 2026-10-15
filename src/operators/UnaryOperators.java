package operators;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		n=-n;
		System.out.println(n);
		
		boolean val=true;
		System.out.println(!val);
		
		int num=10;
		num++;
		System.out.println("num++:"+num);
		
		++num;
		System.out.println("++num:"+num);
		
		num--;
		System.out.println("num--:"+num);
		
		--num;
		System.out.println("--num:"+num);
		
		n=~num;
		System.out.println(n);


		

	}

}
