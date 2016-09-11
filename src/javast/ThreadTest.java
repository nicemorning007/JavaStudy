package javast;

class MyThread extends Thread{
	public void run() {
		while (true) {
			System.out.println("MyThread");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		MyThread thr=new MyThread();
		thr.start();
		while (true) {
			System.out.println("Main");
		}
	}

}
