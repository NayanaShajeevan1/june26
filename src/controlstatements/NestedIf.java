package controlstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=20;
		if(num%2==0) {
			System.out.println(num+"is positive and even number");
		}
		  else {
			System.out.println(num+"is positive and odd number");
		}
	}
		else {
			if(num%2==0) {	
			System.out.println(num+"is negative and even number");
		}
			else {
				System.out.println(num+"is negative and odd number");

				
			}


		}
	}

}
