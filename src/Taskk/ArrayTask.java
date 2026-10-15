package Taskk;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] arr = {1, 4, 17, 7, 25, 3, 100};

		        int sum = 0;
		        for (int i = 0; i < arr.length; i++) {
		            sum = sum + arr[i];
		        }
		        double average = (double) sum / arr.length;

		        System.out.println("Original Array:");
		        for (int i = 0; i < arr.length; i++) {
		            System.out.print(arr[i] + " ");
		        }

		        System.out.println();
		        System.out.println("The average of the said array is: " + average);

		        System.out.println("The numbers in the said array that are greater than the average are:");

		        // Find numbers greater than average
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] > average) {
		                System.out.println(arr[i]);
		            }
		  


		        }
	}

}
