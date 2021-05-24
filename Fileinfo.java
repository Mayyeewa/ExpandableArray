package week7;

import java.io.File;

public class Fileinfo {

	public static void main(String[] args) {
		File myFile = new File("/Users/penprapacalhoun/Desktop/Stanford106AAssignments-2/src/Comparing.txt");
			if(myFile.exists()){
				System.out.println("File name: " + myFile.getName());
				System.out.println("Absolute Pate: " + myFile.getAbsolutePath());
				System.out.println("Readable: " + myFile.canRead());
				System.out.println("Writable: " + myFile.canWrite());
				System.out.println("File size in byte: " + myFile.length());
			}else{
				System.out.println("The File doesn't exist.");
			}
			
		
		
	}

}
