package day06;

public class SumOfArray {
	//for loop
	public void sumArr() {
		int a[]= {5,2,7,9,6};
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum of Array elements :"+sum);
	}
	//for each
	public void sumArray() {
		int a[]= {5,2,7,9,6};
		int sum=0;
		for(int b:a) {
			sum=sum+b;
		}
		System.out.println("sum of Array elements :"+sum);
	}
	public static void main(String[] args) {
		SumOfArray soa=new SumOfArray();
		//soa.sumArr();
		soa.sumArray();
	}

}
