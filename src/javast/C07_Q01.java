package javast;

import java.util.*;
public class C07_Q01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		for(int i = 0; i < 10; i++) {		 
			list.add("A"+i);
		}
		Iterator it = list.iterator();		 
		while(it.hasNext()) {		           
			Object obj = it.next();	         
			System.out.println(obj);			
		}	
	}
}