import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Decider {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner keyboard = new Scanner(System.in);
		try {
			File file2 = new File("cosec-header");
			Scanner inputFile1 = new Scanner(file2);
			while(inputFile1.hasNext()) {
				System.out.println(inputFile1.nextLine());
			}



			// Get the filename.
			String filename = "textConfig.txt";

			// Open the file.
			File file = new File(filename);
			// scan file 
			Scanner inputFile = new Scanner(file);

			// Read lines from the file until no more are left.
			while (inputFile.hasNext())
			{
				// Display the last name read.
				System.out.println(inputFile.nextLine());

			}

			// Close the file.
			inputFile.close();
			inputFile1.close();
			keyboard.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


