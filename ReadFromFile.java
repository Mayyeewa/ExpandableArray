package week7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File myfile = new File("/Users/penprapacalhoun/Desktop/Stanford106AAssignments-2/src/Comparing.txt");
			Scanner myScan = new Scanner(myfile);
			while(myScan.hasNext()) {
				String s = myScan.nextLine();
				System.out.println(s);	
			}
			myScan.close();	
		}catch(FileNotFoundException e) {
			System.out.println("Error.");
			e.printStackTrace();
			
		}
	}

}
