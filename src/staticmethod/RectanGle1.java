package staticmethod;

public class RectanGle1 {
	float l,b;
	float area;
	//default constructor
	public RectanGle1() {
		// TODO Auto-generated constructor stub
		l=2.5f;
		b=2.6f;
		area=l*b;
		System.out.println("area="+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 RectanGle1 ob=new RectanGle1();

	}

}
