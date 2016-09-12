package javast;

class SleepThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i == 3) {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("线程1正在输出：" + i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadSleep {

	public static void main(String[] args) throws Exception {
		new Thread(new SleepThread()).start();
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				Thread.sleep(2000);
			}
			System.out.println("主线程正在输出：" + i);
			Thread.sleep(500);
		}
	}

}
