package day06;

import java.util.Arrays;

public class CheckArraysEquals {
	// video no 16
	// method 1
	public void arrEqual() {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 1, 2, 3, 4, 5, 6 };
		boolean status = Arrays.equals(a1, a2);
		if (status == true) {
			System.out.println("Array are equal");
		} else {
			System.out.println("Array are not equal");
		}
	}

	// method 2

	public void arrayEqual() {
		int[] a1 = { 1, 2, 3, 4, 5, 6 };
		int[] a2 = { 1, 2, 3, 4, 5 };
		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
					break;
				}
			}

		} else {
			status = false;
		}
		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	public static void main(String[] args) {
		CheckArraysEquals obj = new CheckArraysEquals();
		obj.arrEqual();
		obj.arrayEqual();

	}

}
