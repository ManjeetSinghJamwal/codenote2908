//Abstract Example
abstract class Car {
	public abstract void drive();

	public void music() {
		System.out.println("Car Music");

	}
}

class WaganoR extends Car {
	public void drive() {
		System.out.println("WaganoR drive feature");
	}
}

public class AbstractExample {

	public static void main(String[] args) {

		WaganoR obj = new WaganoR();
		obj.drive();
		obj.music();

	}

}
