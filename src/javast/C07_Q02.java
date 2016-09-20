package javast;

import java.util.*;

class Person {
	public String name;
	public int age;

	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}

	public int hashCode() {
		// 返回name的哈希值
		return name.hashCode();
	}

	public boolean equals(Object obj) {
		// 判断是否为Person对象
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		// 将非Person类强制转换为Person类并判断name的值是否相同
		Person person = (Person) obj;
		boolean b = this.name.equals(person.name);
		return b;
	}
	public String toString() {
		return name+" "+age;
	}
}

public class C07_Q02 {
	public static void main(String[] args) {
		HashSet<Person> hashSet = new HashSet<>();
		Person person1 = new Person("Li_hua", 21);
		Person person2 = new Person("Zhang_jie", 22);
		Person person3 = new Person("Chen_Yixun", 46);
		Person person4 = new Person("Chen_Yixun", 40);
		hashSet.add(person1);
		hashSet.add(person2);
		hashSet.add(person3);
		hashSet.add(person4);
		System.out.println(hashSet);
	}
}
