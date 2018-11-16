package filewriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Fileread {

	public static void main(String[] args) {
		File f = new File("test.txt");

		try (BufferedWriter br = new BufferedWriter(new FileWriter(f))) {
			br.write("This is line one");
			br.newLine();

		} catch (IOException e) {
			System.out.println("Unable to read file " + f.toString());
		}
	}
}
