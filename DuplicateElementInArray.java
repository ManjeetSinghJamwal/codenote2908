package day06;

import java.util.HashSet;

public class DuplicateElementInArray {
	static String arr[] = { "c++", "java", "python", "javasvript", "java" };
	static boolean flag = false;

//method First
	void duplicateEle() {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("duplicate element :" + arr[i]);
					flag = true;
				}

			}
		}
		if (flag == false) {
			System.out.println("No Duplicate Element Found :");
		}
	}

//method second
	void duplicateElement() {

		HashSet<String> hs = new HashSet<String>();
		for (String l : arr) {
			if (hs.add(l) == false) {
				System.out.println("Duplicate Element :" + l);
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(" Not Duplicate Element :");
		}
	}

	public static void main(String[] args) {

		DuplicateElementInArray de = new DuplicateElementInArray();
		//de.duplicateEle();
		de.duplicateElement();
	}

}
