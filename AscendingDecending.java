public class AscendingDecending{
public static void main(String[] args){

int arr[]={30,50,10,25,86,45,38,88};
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");}


for(int i=0;i<arr.length-1;i++){
for(int j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;


}
}
}
System.out.print("\n Asending Order: ");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
 System.out.print("\nDescending Order: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
    }
}
}
