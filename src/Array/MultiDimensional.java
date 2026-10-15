package Array;

public class MultiDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][2];
		arr[0][0]=20;
		arr[0][1]=40;
		
		arr[1][0]=60;
		arr[1][1]=80;
		
		arr[2][0]=90;
		arr[2][1]=100;
		System.out.println(arr[1][1]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}


	}

}
