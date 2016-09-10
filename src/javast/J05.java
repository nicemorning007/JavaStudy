package javast;

import javast.Father.Child;

class Father {
	private String name = "Zhang_Jun";
	class Child{
		public void introFather() {
			System.out.println("Father`s name is "+name);
		}
	}
}

public class J05 {

	public static void main(String[] args) {
		Child Child1=new Father().new Child();
		Child1.introFather();
	}

}
