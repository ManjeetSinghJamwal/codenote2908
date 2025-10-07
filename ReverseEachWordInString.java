package day07;

public class ReverseEachWordInString {
	static String str = "Java Programing Selenium Automation";

//Approach1
	void reverseWords() {
		String words[] = str.split("\\s");
		String rev = "";
		System.out.println("Original String:" + str);
		for (String w : words) {
			String revWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				revWord = revWord + w.charAt(i);
			}
			rev = rev + revWord + " ";
		}

		System.out.println("Reverse String :" + rev);
	}
//Approach2

	void reverseEachWord() {
		String reverseWord = "";
		System.out.println("Original String:" + str);
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		reverseWord = reverseWord + sb.toString() + " ";
		System.out.println("Reverse String :" + reverseWord);

	}

	public static void main(String[] args) {

		ReverseEachWordInString rs = new ReverseEachWordInString();

		rs.reverseWords();// Approach1
		System.out.println("By Using StringBuilder method");
		rs.reverseEachWord();// Approach2
	}

}
