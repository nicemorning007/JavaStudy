package javast;

public class C02_Q01 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 100; i = i + 2) {
			sum += i;
		}
		System.out.println("Sum is: " + sum);
	}

}