public class ConstructorExample {
private int age;
private String name;
public ConstructorExample(){  		                      //Default Constructor
System.out.println("in constructorExample...");
}
public ConstructorExample(int a,String n){  		     //Parametrized Constructor
System.out.println("in Parametrized constructorExample...");
age =a;
name=n;
System.out.println(a+""+""+name);
}

public static void main(String[] arg){
ConstructorExample obj=new ConstructorExample();
ConstructorExample obj1=new ConstructorExample(10,"manjit");


}

}