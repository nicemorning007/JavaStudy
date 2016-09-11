package javast;

public class C02_Q03 {
	public static void main(String[] args) {
		int a[] = { 25, 24, 12, 76, 101, 96, 28 };
		System.out.println("原数组：");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
		System.out.println("");
		System.out.println("排序后：");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] >= a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
