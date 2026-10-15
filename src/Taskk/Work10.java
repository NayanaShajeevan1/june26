package Taskk;

public class Work10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=500;i++) {
			int num=i;
			int sum=0;
			while(num>0) {
				int digit=num%10;
				sum=sum+(digit*digit*digit);
				num=num/10;
			}
			if(sum==i) {
				System.out.println(i);
			}
		}
		
		

	}

}
