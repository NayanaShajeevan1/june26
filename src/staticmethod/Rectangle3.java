package staticmethod;

public class Rectangle3 {
	//instance variable
	float area;
	public Rectangle3(float l ,float b) {
		// TODO Auto-generated constructor stub
		area=l*b;
	}
	public void display() {
		System.out.println("area="+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//copy constructor
		Rectangle3 ob=new Rectangle3(2.5f,2.6f);
		ob.display();
		Rectangle3 ob1=ob;
		ob1.display();

	}

}
