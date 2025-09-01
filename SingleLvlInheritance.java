 class Animal{
void eat(){

System.out.println("animal eating");
}
}

class Dog extends Animal{
void sound(){

System.out.println("dog barking....");
}
}


public class SingleLvlInheritance{
public static void main(String[] args){
Dog d=new Dog();
d.eat();
d.sound();
}
}