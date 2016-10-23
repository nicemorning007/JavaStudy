package javast;

class MyThread_1 extends Thread{
	public MyThread_1(String name) {
         super(name);       
	}
	public void run() {
        System.out.println(this.getName());
	}
}   

public class C05_Q01_b {

	public static void main(String[] args) {
		new MyThread_1("First").start();
		new MyThread_1("Second").start();
	}

}
