package basics;

import java.util.Scanner;

public class Scanner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		String gender;
		String addres;
		long phonenno;
		String emailid;
		float totalmark;
		String grade;
		String course;
		int totalamnt;
		String institution;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Student Detais");
		System.out.println("============");
		
		System.out.println("Enter your name:");
		name=scan.nextLine();
		
		System.out.println("Enter your age:");
		age=scan.nextInt();
		
		System.out.println("Enter your gender:");
		gender=scan.next();
		
		System.out.println("Enter your address:");
		addres=scan.nextLine();
		
		System.out.println("Enter your phonenumber:");
		phonenno=scan.nextLong();
		
		System.out.println("Enter your emailid:");
		emailid=scan.nextLine();
		
		System.out.println("Enter your totalmark:");
		totalmark=scan.nextFloat();
		
		System.out.println("Enter your grade:");
		grade=scan.next();
		
		System.out.println("Enter your course:");
		course=scan.nextLine();
		
		System.out.println("Enter totalamount:");
		totalamnt=scan.nextInt();
		
		System.out.println("Enter your institution:");
		institution=scan.nextLine();
		



	}

}
