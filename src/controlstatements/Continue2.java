package controlstatements;

public class Continue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==2 && j==3) {
				 	continue;
					
				}
				System.out.println(i+""+j);
			}
			System.out.println();
		}

	}

}
