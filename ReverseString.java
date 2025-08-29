public class ReverseString{
public static void main(String[] args){
String str="myname";
String revstr="";
int strlen=str.length();
for(int i=strlen-1;i>=0;i--){
revstr=revstr+str.charAt(i);

}
System.out.println("normal String: "+str);
System.out.println("ReverseString: "+revstr);
}}