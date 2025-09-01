class Animal{
void eat(){
System.out.println("animal eating.....");

}

}
class Dog extends Animal{
void bark(){
System.out.println("Dog barking.....");

}

}
class Puppy extends Dog{
void beep(){
System.out.println("animal beeping.....");

}

}
public class MultiLvlInheritance{
public static void main(String[] args){
Puppy p=new Puppy();
p.eat();
p.bark();
p.beep();


}
}