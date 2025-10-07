package day07;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String str = "Java   Programing   Selenium  Automation";
		System.out.println("Before string :" + str);
		str = str.replaceAll("\\s", "");
		System.out.println("After string :" + str);
	}

}
