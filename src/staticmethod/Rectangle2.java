package staticmethod;

public class Rectangle2 {
	float area;
	//parameterized constructor
	public Rectangle2(float l,float b) {
		// TODO Auto-generated constructor stub
		area=l*b;
		System.out.println("area="+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle2 ob=new Rectangle2(2.5f,2.6f);

	}

}
