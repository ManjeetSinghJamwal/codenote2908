class Car{

String color;
void drive()
{
System.out.print("Car is driving");

}
}
public class Test extends Car{
public static void main(String[] args){
Car myCar=new Car();
myCar.drive();
myCar.color="Red";


}


}