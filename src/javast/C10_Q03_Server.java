package javast;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class C10_Q03_Server {

	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket(8002);
		Socket socket = serverSocket.accept();
		OutputStream outputStream = socket.getOutputStream();
		System.out.println("Sending");
		outputStream.write(("hello world").getBytes());
		System.out.println("Finished");
		outputStream.close();
		socket.close();
		serverSocket.close();
	}

}
