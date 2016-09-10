package javast;

import java.util.Scanner;

public class C02_Q02 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Try your number:");
		int x=sc.nextInt();
		int y=0;
		if (x<0) {
			y=x*x-1;
		}
		else if (x>0) {
			y=x+3;
		}
		else {
			;
		}
		System.out.println(y);
	}
}
