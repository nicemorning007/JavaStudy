package javast;

interface Shape {
	double area(double d);
}

class Square implements Shape {
	public double area(double d) {
		double are = d * d;
		return are;
	}

	public void show(double d) {
		System.out.println("Square`s area is:" + area(d));
	}
}

class Circle implements Shape {
	public double area(double d) {
		final double PI = 3.1415926535;
		double are = PI * d * d;
		return are;
	}

	public void show(double d) {
		System.out.println("Circle`s area is:" + area(d));
	}
}

public class C04_Q02 {

	public static void main(String[] args) {
		Square Sq1 = new Square();
		Circle Ci1 = new Circle();
		Sq1.show(2);
		System.out.println();
		Ci1.show(3);
	}

}
