package week7;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("/Users/penprapacalhoun/Desktop/Stanford106AAssignments-2/src/Comparing.txt");
			myWriter.write("Today is Wednesday");
			myWriter.close();
				System.out.println("Successful");
		}catch(IOException e) {
			System.out.println("ERROR");		
			e.printStackTrace();
		}
	}

}
