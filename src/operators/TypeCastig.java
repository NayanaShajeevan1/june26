 package operators;

public class TypeCastig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char val='G';
		int num=val;
		float dec=num;
		System.out.println("-----widening typecasting------");
		System.out.println("val="+val+"\t"+"num="+num+"\t"+"dec="+dec);
		
		float dec1=55.0f;
		int num1=(int)dec1;
		char val1=(char)num1;
		
		System.out.println("-----Narrowing typecasting------");
		System.out.println("dec1="+dec1+"\t"+"num1="+num1+"\t"+"val1="+val1);
		
	}

}
