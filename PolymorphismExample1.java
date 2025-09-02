//OverLoading Example
public class PolymorphismExample1 {
	public void add(int a,int b) {
		System.out.println(a+b);
		
		
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
		
		
	}

	public static void main(String[] args) {
		PolymorphismExample1 obj=new PolymorphismExample1();
		obj.add(10, 20);
		obj.add(10, 9, 05);
	

	}

}
