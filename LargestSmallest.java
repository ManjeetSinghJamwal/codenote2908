public class LargestSmallest {
public static void main(String[] args){
int arr[]={10,25,46,85,94,76,55};
int largest=arr[0];
int smallest=arr[0];


for(int i=0;i<arr.length;i++){
if(arr[i]>largest){
largest=arr[i];}

if(arr[i]<smallest){
smallest=arr[i];
}
}


System.out.println("largest number"+ largest);
System.out.println("smallest number"+ smallest);


}


}