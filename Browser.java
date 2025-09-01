import java.util.Scanner; 
 public class Browser{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 System.out.print("Enter Browser name: ");
String browser = sc.nextLine();   
switch(browser){
case "chrome":
System.out.println("Launch Browser chrome");
break;
case "mozila":
System.out.println("Launch Browser mozila");
break;
case "edge":
System.out.println("Launch Browser edge");
break;
case "safari":
System.out.println("Launch Browser safari");
break;
case "opera":
System.out.println("Launch Browser opera");
break;


default:
System.out.println("Enter valid browser");

}

}


}