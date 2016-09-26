package javast;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TEST_server {

	public static void main(String[] args) throws Exception {
		new Server().listen();
	}
	
}
class Server{
	final int PORT = 7788;

	public void listen() throws Exception {
		ServerSocket serverSocket = new ServerSocket(PORT);
		Socket client = serverSocket.accept();
		OutputStream outputStream = client.getOutputStream();
		System.out.println("Start.");
		outputStream.write(("Hello World").getBytes());
		Thread.sleep(3000);
		System.out.println("End");
		outputStream.close();
		client.close();
		serverSocket.close();
	}
}
