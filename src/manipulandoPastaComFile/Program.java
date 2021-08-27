package manipulandoPastaComFile;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Apnas pastas
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		// Apenas os arqvuis
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("FILES: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean sucess= new File(strPath + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + sucess);
		
		sc.close();
	}

}
