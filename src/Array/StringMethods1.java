package Array;

public class StringMethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1="arun";
		String name2="athul";
		//length()
		System.out.println(name1.length());
		System.out.println(name2.length());

		//charAt()
		System.out.println(name1.charAt(2));
		System.out.println(name2.charAt(4));
		
		//compareTo()
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="go";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareTo(s4));
		System.out.println(s3.compareTo(s4));
		
		//concat
		System.out.println(name1.concat("das"));
		
		//contains
		String n1="java is a highlevel programming language";
		System.out.println(n1.contains("programming"));
		
		
		//touppercase
		System.out.println(s1.toUpperCase());
		
		//tolower
		String m1="HELLO";
		System.out.println(m1.toLowerCase());
		
		//getbytes
		String s="ABCDEFG";
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);

		}
		
		//equalignorecase
		 String m2="hello";
		 String m3="HELLO";
		 String m4="go";
		 System.out.println(m2.equalsIgnoreCase(m3));
		 System.out.println(m2.equalsIgnoreCase(m4));
		 
		 //substring
		 String s6="programming";
		 System.out.println(s6.substring(3));
		 System.out.println(s6.substring(3,9));
		 
		 //startwith and endwith
		 System.out.println(n1.startsWith("java"));
		 System.out.println(n1.endsWith("g"));
		 
		 //replace
		 System.out.println(n1.replace('a','o' ));
		 System.out.println(n1.replace("java","python" ));
		 
		 //trim
		 String a="hello java";
		 System.out.println(a+"javaprogrmming");
		 System.out.println(a.trim()+"javaprogramming");
		 
		 

		 
		 
		 


	}

}
