
class Animal {
	void eat() {
		System.out.println("animal eating.....");

	}

}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog barking.....");

	}

}

class Cat extends Animal {
	void meow() {
		System.out.println("Meow Meow.....");

	}

}

	public class HierarchicalInheritance {
	public static void main(String[] args) {
       	Dog d = new Dog();
		d.eat();
		d.bark();

		Cat c = new Cat();
		c.eat();
		c.meow();
		
	

	}
}
