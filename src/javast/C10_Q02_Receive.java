package javast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class C10_Q02_Receive {

	public static void main(String[] args) throws Exception {
		byte[] bytes = new byte[1024];
		DatagramSocket datagramSocket = new DatagramSocket(8051);
		DatagramPacket datagramPacket = new DatagramPacket(bytes, 1024);
		System.out.println("Waiting");
		datagramSocket.receive(datagramPacket);
		String string = new String(bytes, 0, datagramPacket.getLength());
		System.out.println(string);
		System.out.println("End");
		datagramSocket.close();
	}

}
