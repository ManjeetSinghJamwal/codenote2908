public class CountVowels {
public static void main(String[] args){
String str="shAnkar125 mAn jeet ";
int strLen=str.length();
int count=0,space=0,digit=0;
for(int i=0;i<=strLen-1;i++){
char ch=str.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
count++;


}

else if(ch==' ')
{
space++;
}
else if(Character.isDigit(ch))
{
digit++;
}
}
System.out.println("Number of Vowels :"+ count);
System.out.println("Number of Space :"+ space);
System.out.println("Number of digit :"+ digit);
System.out.print("Length of String :"+ strLen);
} }