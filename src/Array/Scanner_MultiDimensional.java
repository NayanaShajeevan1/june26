package Array;

import java.util.Scanner;

public class Scanner_MultiDimensional {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int rowsize;
		int columnsize;
		System.out.println("enter rowsize");
		rowsize=scan.nextInt();
		System.out.println("enter columnsize");
		columnsize=scan.nextInt(); 
		
		int arr[][]=new int[rowsize][columnsize];
		System.out.println("enter array elements:");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=scan.nextInt();
				
			}
			
		}
		System.out.println("Array elements");
		for(int i=0;i<rowsize;i++) {
			for(int j=0;j<columnsize;j++) {
				System.out.println(arr[i][j]);
				
			}
			
		}
		
		
	}

}
