package Taskk;

import java.util.Scanner;

public class Work7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter first number:");
		a=scan.nextInt();
		System.out.println("enter second number:");
		b=scan.nextInt();
		System.out.println("enter third number:");
		c=scan.nextInt();
		if(a>=b&&a>=c) {
			System.out.println("Greatest number is:"+a);
		}
		else if(b>=c&&b>=a) {
			System.out.println("Greatest number is:"+b);

		}
		else {
			System.out.println("Greatest number is:"+c);

		}

	}

}
