package day06;

import java.util.Arrays;

public class MaxAndMinArray {
	static int a[] = { 50, 30, 40, 20, 60 };

//max
	void maxValue() {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("Max value" + max);
	}

	// min
	void minValue() {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("Min value" + min);
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(a));
		MaxAndMinArray mam = new MaxAndMinArray();
		mam.maxValue();
		mam.minValue();
	}

}
