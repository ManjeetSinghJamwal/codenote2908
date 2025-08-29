public class palidrome{

public static void main(String[] args){

String str="Madam";
String revstr="";
int strlen=str.length();
for(int i=strlen-1;i>=0;i--){
revstr=revstr+str.charAt(i);
}
System.out.println(revstr);
if(str.equalsIgnoreCase(revstr)){
System.out.println("is a palidrome");}
else
{System.out.println("is not a palidrome");
}}
}