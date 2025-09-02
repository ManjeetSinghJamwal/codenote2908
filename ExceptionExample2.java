//Best Example for Setter and getter

class Human {
	private int age;
	private String name;

	public void setAge(int a) {
		age=a;

	}

	public void setName(String n) {
		name=n;

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

public class ExceptionExample2 {

	public static void main(String[] args) {
		Human obj = new Human();
		obj.setAge(10);
		obj.setName("manjit");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
