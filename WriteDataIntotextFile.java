package day07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntotextFile {
	public static void main(String[] args) throws IOException {
		FileWriter wb = new FileWriter("D:\\NacroPractice\\practice1\\OctBatch12\\Resource\\manjit.txt");
		BufferedWriter bw = new BufferedWriter(wb);
		wb.append("hii this is my new file" + "\n");
		wb.append("Selenium with python" + "\n");
		wb.append("selenium with java" + "\n");
		System.out.println("finish!!!" + "\n");
		bw.close();
		wb.close();
	}

}
