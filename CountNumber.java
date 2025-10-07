package day07;

public class CountNumber {
	public static void main(String[] args) {
		int n = 654321;
		int count = 0;
		int rev = 0;
		int sum = 0;
		while (n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			sum = sum + digit;
			n = n / 10;
			count++;
		}
		System.out.println("sum:\t"+sum);
		System.out.println("rev:\t"+rev);
		System.out.println("count:\t"+count);
	}

}
