package basics;

import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[]) {
		String name;
		int age;
		String gender;
		String dob;
		String address;
		long phoneno;
		String emailid;
		String quli;
		float totalmark;
		String grade;
		String course;
		short instament;
		int total;
		String institute;
		boolean joining;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name:");
		name=scan.nextLine();
		
		System.out.println("Enter your age:");
		age=scan.nextInt();
		
		System.out.println("Enter your gender:");
		gender=scan.next();
		
		System.out.println("Enter your dob:");
		dob=scan.next();
		
		System.out.println("Enter your address:");
		address=scan.next();
		
		System.out.println("Enter your phonenumber:");
		phoneno=scan.nextLong();
		
		System.out.println("Enter your email id:");
		emailid=scan.next();
		
		System.out.println("Enter your qualification:");
		quli=scan.nextLine();
		
		System.out.println("Enter totalmark:");
		totalmark=scan.nextFloat();
		
		System.out.println("Enter grade:");
		grade=scan.next();
		
		System.out.println("Enter your course:");
		course=scan.nextLine();
		
		System.out.println("Enter installment:");
		instament=scan.nextShort();
		
		System.out.println("Enter total amount:");
		total=scan.nextInt();
		
		System.out.println("Enter your institute:");
		institute=scan.nextLine();
		
		System.out.println("joining:");
		joining=scan.nextBoolean();
	}

}
