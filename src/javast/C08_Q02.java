package javast;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C08_Q02 {

	public static void main(String[] args) throws Exception {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String password = "";
		boolean b = false;
		for (int i = 0; i < 5; i++) {
			System.out.println("Password:");
			password = bufferedReader.readLine();
			if (password.equals("123456")) {
				System.out.println("Game Start!");
				b = true;
				break;
			} else {
				System.out.println("Password Error.");
			}
		}
		if (!b) {
			System.out.println("You`re not allow to get start.");
		}
		System.exit(0);
	}
}
