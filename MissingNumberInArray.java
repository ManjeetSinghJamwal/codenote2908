package day06;

public class MissingNumberInArray {

	// Array should not have duplicate
	// Array No need to be sorted order
	// value should be in range
	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		int sum2 = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		System.out.println("Sum of Array Elements :"+sum);
		for (int i = 0; i <= 9; i++) {
			sum2 = sum2 + i;

		}
		System.out.println("sum of number 1 to 9 :"+sum2);
		int missingNumber=sum2-sum;
		System.out.println("MissingNumber :"+missingNumber);
	}

}
