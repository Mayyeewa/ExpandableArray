package week7;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		try {
			File myObj = new File("/Users/penprapacalhoun/Desktop/Stanford106AAssignments-2/src/Comparing.txt");
			if(myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			}else {
					System.out.println("File already Exists");
				}
			}catch(IOException e) {
				System.out.println("Error");
				e.printStackTrace();
			}
		}
	}
			
		
		
		
		
		

