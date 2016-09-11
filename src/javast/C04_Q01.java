package javast;

class Students {
	protected String name;
	protected int age;

	public Students() {
	}

	public Students(String n, int a) {
		name = n;
		age = a;
	}

	public void show() {
		System.out.println("Student`s name is:" + name + "\nStudent`s age is:" + age);
	}
}

class Undergraduate extends Students {
	private String degree;

	public Undergraduate(String n, int a, String d) {
		name = n;
		age = a;
		degree = d;
	}

	public void show() {
		System.out
				.println("Student`s name is:" + name + "\nStudent`s age is:" + age + "\nStudent`s degree is:" + degree);
	}
}

public class C04_Q01 {

	public static void main(String[] args) {
		Students Stu1 = new Students("Li_Hua", 19);
		Undergraduate Un1 = new Undergraduate("Zhang_Jie", 21, "doctor");
		Stu1.show();
		System.out.println();
		Un1.show();
	}

}
