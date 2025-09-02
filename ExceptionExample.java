class Human{
	private int age=11;
	private String name="manjeet";
	public int getAge() {
		return age;
	}
	
	public String gettName() {
		return name;
	}
	
	
}
public class ExceptionExample {
	

	public static void main(String[] args) {
		Human obj=new Human();
		System.out.println(obj.getAge());
		System.out.println(obj.gettName());
		
		
		
		
		

	}

}