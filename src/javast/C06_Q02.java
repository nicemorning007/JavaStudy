package javast;

import java.util.*;
import java.text.*;

public class C06_Q02 {

	public static void main(String[] args) {
		Date date = new Date();
		DateFormat full = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Today is:" + full.format(date));
		Calendar calendar = Calendar.getInstance();
		Date temp = new Date();
		calendar.add(Calendar.DATE, 100);
		temp = calendar.getTime();
		System.out.println("100days later:"+full.format(temp));
	}

}
