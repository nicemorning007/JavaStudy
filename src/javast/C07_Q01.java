package javast;

import java.util.*;

public class C07_Q01 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("No.1");
		list.add("No.2");
		list.add("No.3");
		list.add("No.4");
		list.add("No.5");
		list.add("No.6");
		list.add("No.7");
		list.add("No.8");
		list.add("No.9");
		list.add("No.10");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}