package javast;

class MyFirstThread extends Thread {
@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

class MySecondThread extends Thread {
@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}

public class C05_Q01_a {

	public static void main(String[] args) {
		System.out.println();
		MyFirstThread myfirst = new MyFirstThread();
		Thread mf = new Thread(myfirst, "first");
		MySecondThread mysecond = new MySecondThread();
		Thread ms = new Thread(mysecond, "second");
		mf.start();
		ms.start();
	}

}
