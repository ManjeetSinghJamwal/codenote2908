public class Armstrong{
public static void main(String[] args){
int num=152;
int orgNum=num;
int sum=0;
while (num>0){
int digit=num%10;
sum=sum+(digit*digit*digit);
num=num/10;
} 
if(sum==orgNum){
System.out.print(orgNum+" :is a Armstrong");
}
else{
System.out.print(orgNum+" :is not a Armstrong");}
}
}