package javast;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C08_Q02 {

	public static void main(String[] args) throws IOException {
		char count;
		int password;
		FileReader fileReader = new FileReader("GameGetInTimes.txt");
		FileWriter fileWriter = new FileWriter("GameGetInTimes.txt");
		FileReader fileReader2 = new FileReader("PassWord.txt");
		System.out.println("Please input your password:");
		if ((count = (char) fileReader.read()) < '4') {
			while ((password = System.in.read()) != -1) {
				if (password == (int)fileReader2.read()) {
					System.out.println("Game Start!");
					fileReader2.close();
					fileReader.close();
					fileWriter.close();
					System.exit(0);
				} else {
					++count;
					fileWriter.write(count);
					System.out.println("Password Wrong!!!\nTry again!!!");
					fileReader2.close();
					fileReader.close();
					fileWriter.close();
					System.exit(0);
				}
			}
		} else {
			fileReader2.close();
			fileReader.close();
			fileWriter.close();
			System.out
					.println("You`ve already give the wrong password five times.\nNow you`re not allow to get start.");
			System.exit(0);
		}
	}

}
