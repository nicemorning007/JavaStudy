package javast;

import java.io.InputStream;
import java.net.Socket;

public class TEST_client {

	public static void main(String[] args) throws Exception {
		new Client().connect();
	}

}

class Client {
	final int PORT = 7788;

	public void connect() throws Exception {
		Socket client = new Socket("127.0.0.1", 7788);
		InputStream inputStream = client.getInputStream();
		byte[] bs = new byte[1024];
		int len = inputStream.read(bs);
		System.out.println(new String(bs, 0, len));
		inputStream.close();
		client.close();
	}
}