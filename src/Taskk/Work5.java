package Taskk;

import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;

        System.out.print("Enter first number: ");
         a = sc.nextInt();

        System.out.print("Enter second number: ");
         b = sc.nextInt();

        System.out.print("Enter third number: ");
         c = sc.nextInt();

        System.out.print("Enter fourth number: ");
         d = sc.nextInt();

        if (a == b && b == c && c == d) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }


}
