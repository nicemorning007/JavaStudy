package javast;

class Student{
	private int scor;
	private String name;
	public Student(){
		scor=0;
		name="N/A";
	}
	public Student(int s,String n){
		set(s, n);
	}
	private void set(int s,String n){
		scor=s;
		name=n;
	}
	public void display(){
		System.out.println("Score is "+scor);
		System.out.println("Name is "+name);
	}
}

public class J04 {

	public static void main(String[] args) {
		Student Stu1 = new Student();
		Student Stu2 = new Student(87,"Li_Hua");
		Stu1.display();
		Stu2.display();
	}

}
