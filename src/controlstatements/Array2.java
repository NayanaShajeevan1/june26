package controlstatements;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		Scanner scan=new Scanner(System.in);
		int arraysize;
		
		System.out.println("enter the size:");
		arraysize=scan.nextInt();
		
		int arr[]=new int[arraysize];
		System.out.println("enter array  elements:");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
			
			System.out.println("array elements:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		}

	
}
