package javast;

import java.io.InputStream;
import java.net.Socket;

public class C10_Q03_Client {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 8002);
		InputStream inputStream = socket.getInputStream();
		byte[] bs = new byte[1024];
		int len = inputStream.read(bs);
		System.out.println(new String(bs, 0, len));
		System.out.println("Finished");
		inputStream.close();
		socket.close();
	}

}
