package oops;

public class WithoutusingThis {
	String name;
	int rno;
	float fee;
	public  WithoutusingThis(String name,int rno,float fee ){
		name=name;
		rno=rno;
		fee=fee;
	}
	public void display() {
		System.out.println("name"+name);
		System.out.println("rno"+rno);
		System.out.println("fee"+fee);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutusingThis ob=new WithoutusingThis("nayana",10,10000.40f);
		ob.display();
		

	}

}
