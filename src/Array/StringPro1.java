package Array;

public class StringPro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"nayana","minsha","aslaha"};
        System.out.println(names[1]); 	
        for(String data:names) {
        	System.out.println(data);
        }
		//string literals
		String name1="arun";
		String name2="athul";
		
		System.out.println(name1==name2);
		
		String name3=new String("athul");
		String name4=new String("athul");
		
		System.out.println(name3==name4);
		
		//strin g mthod-equals
		System.out.println(name3.equals(name4));
		
		name1 =name1+"thomas";
		System.out.println(name1);
		
		//using concat()
		name2.concat("das");
		System.out.println(name2);
		
		//stringbuffer and stringbuilder
		StringBuffer st=new StringBuffer("mohan");
		StringBuilder st1=new StringBuilder("das");
		
		st.append(st1);
		System.out.println(st);
		
		st.append("v");
		System.out.println(st);
		 

	}

}
