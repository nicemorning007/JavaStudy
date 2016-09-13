package javast;

class PrintNEW implements Runnable {
	int i = 0;

	@Override
	public void run() {
		while (i < 50) {
			System.out.println(Thread.currentThread().getName());
			i++;
		}
	}
}

public class C05_Q02 {

	public static void main(String[] args) {
		PrintNEW Pr = new PrintNEW();
		Thread PR = new Thread(Pr, "NEW");
		int j = 0;
		PR.start();
		while (j < 100) {
			System.out.println(Thread.currentThread().getName());
			j++;
		}
	}

}
