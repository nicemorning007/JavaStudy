package javast;

class MaxPriority implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "正在输出：" + i);
		}
	}
}

class MinPriority implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"正在输出："+i);
		}
	}
}

public class ThreadPriority {

	public static void main(String[] args) {
		Thread MinPriority=new Thread(new MinPriority(),"低优先级--");
		Thread MaxPriority=new Thread(new MaxPriority(),"高优先级--");
		MaxPriority.setPriority(10);
//
		MinPriority.start();
		MaxPriority.start();
//		两种不同排序，输出结果不同
		MaxPriority.start();
		MinPriority.start();
	}

}