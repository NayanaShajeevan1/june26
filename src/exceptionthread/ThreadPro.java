package exceptionthread;

public class ThreadPro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String threadname=Thread.currentThread().getName();
		System.out.println("current threadname="+threadname);
		System.out.println("Display current Thread="+Thread.currentThread());
		Thread t=new Thread();
		t.setName("New Thread");
		System.out.println(t);
		
		for(int i=1;i<=5;i++) {
			Thread.sleep(1000);
			System.out.println(i);
		}

	}

}
