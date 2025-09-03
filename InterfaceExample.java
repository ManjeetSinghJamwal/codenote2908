package Javabasic;

interface A {
	int a=10;   // already Static and Final
	String s="manjit";
	void show();

	void configure();

}

class B implements A {
	public void show() {
		System.out.println("in show");
	}

	public void configure() {
		System.out.println("in configure");
	}

}

public class InterfaceExample {

	public static void main(String[] args) {
		B obj = new B();
		obj.show();
		obj.configure();

		System.out.println(A.a);
		System.out.println(A.s);
	}
}
