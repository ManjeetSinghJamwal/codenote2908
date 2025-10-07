package day07;

public class RemoveJunk {
	public static void main(String[] args) {
		String str = "Hello@2025#Testing!";
		System.out.println(str);
		String s = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

}
