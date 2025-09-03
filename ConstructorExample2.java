package Javabasic;

class C {
	public C() {

		System.out.println("C");
	}

	public C(int c) {

		System.out.println("int c :" + c);
	}

}

class D extends C {
	public D() {
		super();
		System.out.println("D");
	}

	public D(int d) {
		this();
		System.out.println("int d:" + d);
		
	}

}

public class ConstructorExample2 {
	public static void main(String[] args) {
		//D obj = new D();
		D obj2 = new D(5);

	}

}
