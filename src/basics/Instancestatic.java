package basics;

public class Instancestatic {
	String name;
	static String course="Testing";
	public static void main(String args[]) {
		int mark;
		Instancestatic stud1=new Instancestatic();
		System.out.println("Name="+(stud1.name="Aswajith"));
		System.out.println("course="+course);
		System.out.println("Mark="+(mark=15));
		
		Instancestatic stud2=new Instancestatic();
		System.out.println("Name="+(stud2.name="anupriya"));
		System.out.println("course="+course);
		System.out.println("Mark="+(mark=12));
		
		Instancestatic stud3=new Instancestatic();
		System.out.println("Name="+(stud3.name="shamleek"));
		System.out.println("course="+(course="developer"));
		System.out.println("Mark="+(mark=14));
		
		Instancestatic stud4=new Instancestatic();
		System.out.println("Name="+(stud4.name="minsha"));
		System.out.println("course="+course);
		System.out.println("Mark="+(mark=16));



		
	}

}
