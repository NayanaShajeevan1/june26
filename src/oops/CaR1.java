package oops;

public class CaR1 implements VehicLE{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicLE v=new CaR1();//upcasting-objct create for subclass 
		v.start();

	}

	public void start() {
		System.out.println("self start");
		// TODO Auto-generated method stub
		
	}

}
