package oops;

public class ThisKeyword {
	//change variable name
	String name;
	int rno;
	float fee;
	public ThisKeyword(String namee,int rolno,float fees){
		this.name=namee;
		this.rno=rolno;
		this.fee=fees;
	}
	public void display() {
		System.out.println("name="+name);
		System.out.println("rno="+rno);
		System.out.println("fees="+fee);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword ob=new ThisKeyword("nayana",10,10000.40f);
		ob.display();
		
	}

	
}
