package day07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("D:\\NacroPractice\\practice1\\OctBatch12\\Resource\\manjit.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fr.close();
	}

}
