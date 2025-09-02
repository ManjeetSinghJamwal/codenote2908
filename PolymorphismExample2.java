package Javabasic;
class Exm{
	public void add(int a,int b) {
		System.out.println("parents"+(a+b));}
	
}
public class PolymorphismExample2 extends Exm {
	
	public void add(int a,int b) {
		super.add(20,20);
		System.out.println("child"+ (a+b));
		
		}

	public static void main(String[] args) {
		PolymorphismExample2 obj=new PolymorphismExample2();
		obj.add(10, 20);
		
		
	}

}
