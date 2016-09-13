package javast;

class Teacher implements Runnable {
	private int sum = 1;

	private synchronized void count() {
		if (sum < 81) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("第" + Thread.currentThread().getName() + "位老师正在发第" + sum + "份作业");
			sum++;
		}
	}

	@Override
	public void run() {
		while (true) {
			count();
			if (sum == 81) {
				System.exit(0);
			}
		}
	}
}

public class C05_Q03 {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		new Thread(teacher, "1").start();
		new Thread(teacher, "2").start();
		new Thread(teacher, "3").start();
	}

}
