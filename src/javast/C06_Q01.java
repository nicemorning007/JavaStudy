package javast;

public class C06_Q01 {

	public static void main(String[] args) {
		String St1 = "HelloWorld";
		StringBuffer Sb1 = new StringBuffer();
		for (int i = 0; i < St1.length(); i++) {
			if (Character.isLowerCase(St1.charAt(i))) {
				Sb1.append(Character.toUpperCase(St1.charAt(i)));
			} else if (Character.isUpperCase(St1.charAt(i))) {
				Sb1.append(Character.toLowerCase(St1.charAt(i)));
			}
		}
		Sb1.reverse();
		System.out.println(Sb1.toString());
	}

}
