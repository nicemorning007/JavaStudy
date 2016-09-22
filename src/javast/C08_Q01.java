package javast;

import java.io.*;

public class C08_Q01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fileReader = new FileInputStream("D:\\OneDrive\\Pictures\\相機相簿\\(╯°□°）╯︵ ┻━┻\\20160817_172156000_iOS.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream("FileOutputStream.jpg");
		byte[] byt = new byte[64];
		@SuppressWarnings("unused")
		int b = 0;
		while ((b = fileReader.read(byt)) != -1) {
			fileOutputStream.write(byt);
		}
		fileReader.close();
		fileOutputStream.close();
		System.out.println("Done");
		FileReader fileReader2 = new FileReader("text1.txt");
		FileWriter fileWriter = new FileWriter("FileWrite.txt");
		char[] by = new char[64];
		int a = 0;
		while (a != -1) {
			for (int i = 0; i < by.length; i++) {
				a = fileReader2.read();
				by[i] = (char) a;
			}
		}
		fileWriter.write(by);
		fileReader2.close();
		fileWriter.close();
		System.out.println("Done");
	}

}
