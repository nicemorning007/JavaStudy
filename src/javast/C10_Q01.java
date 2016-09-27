package javast;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class C10_Q01 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		InetAddress inetAddress2 = InetAddress.getByName("www.baidu.com");
		System.out.println("Locla Host name: " + inetAddress.getHostName());
		System.out.println("Local IP: " + inetAddress.getHostAddress());
		System.out.println("Oracle IP: " + inetAddress2.getHostAddress());
		System.out.println("Oracle Host name: " + inetAddress2.getHostName());
	}

}
