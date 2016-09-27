package javast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class C10_Q02_Send {

	public static void main(String[] args) throws Exception {
		DatagramSocket datagramSocket = new DatagramSocket();
		String string = "hello world";
		DatagramPacket datagramPacket = new DatagramPacket(string.getBytes(), string.length(),
				InetAddress.getByName("localhost"), 8051);
		System.out.println("Sending");
		datagramSocket.send(datagramPacket);
		datagramSocket.close();
		System.out.println("Finished");
	}

}
