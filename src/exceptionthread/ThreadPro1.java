package exceptionthread;
class ThreadNew extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("New Thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPro1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadNew t=new ThreadNew();
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	

	}

}
