package Taskk;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int p,q,r;

        System.out.print("Input the first number: ");
         p = sc.nextInt();

        System.out.print("Input the second number: ");
         q = sc.nextInt();

        System.out.print("Input the third number: ");
         r = sc.nextInt();

        boolean result = ((p + q) == r || (q + r) == p || (r + p) == q);

        System.out.println("The result is: " + result);
    }


	}


