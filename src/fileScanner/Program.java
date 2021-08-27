package fileScanner;
import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.next());
			}
		} catch (Exception e) {
			System.out.println("ERROR: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
