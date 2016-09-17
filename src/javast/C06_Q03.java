package javast;

import java.util.Random;

public class C06_Q03 {

	public static void main(String[] args) {
		Random ran=new Random();
		for (int i = 0; i < 5; i++) {
			System.out.println(20+ran.nextInt(31));
		}
	}

}
