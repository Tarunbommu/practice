package day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {

	public static void main(String[] args) {
		File f=new File("C:\\Users\\TBOMMU\\Desktop\\new2.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		try {
			FileWriter fw=new FileWriter(f);
			fw.write("Java is good programming language\n");
			fw.write("We have to learn the java programming");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
		
		
		try {
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//			f.delete();
		}
	}

