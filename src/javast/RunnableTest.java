package javast;

class MyThreadRun implements Runnable{
	public void run() {
		while (true) {
			System.out.println("MyThreadRun");
		}
	}
}

public class RunnableTest {

	public static void main(String[] args) {
		MyThread myt=new MyThread();
		Thread thread=new Thread(myt);
		thread.start();
		while (true) {
			System.out.println("Main");
		}
	}

}
