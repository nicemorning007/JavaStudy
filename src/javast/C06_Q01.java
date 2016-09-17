package javast;

public class C06_Q01 {

	public static void main(String[] args) {
		String St1 = "HelloWorld";
		String StrTemp = St1;
		// char[] Ch1;
		// Ch1 = St1.toCharArray();
		StringBuffer Sb1 = new StringBuffer();
		for (int i = 0; i < St1.length(); i++) {
			if (Character.isLowerCase(St1.charAt(i))) {
				StrTemp.toUpperCase();
				Sb1.append(StrTemp.charAt(i));
			} else if (Character.isUpperCase(St1.charAt(i))) {
				StrTemp.toLowerCase();
				Sb1.append(StrTemp.charAt(i));
			} else {
				Sb1.append(StrTemp.charAt(i));
			}
			StrTemp = St1;
		}
		Sb1.reverse();
		System.out.println(Sb1.toString());
	}

}
