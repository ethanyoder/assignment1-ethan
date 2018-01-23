import java.io.FileNotFoundException;
import java.io.PrintWriter;

// Ekaterina Molostvova
// 21/01/2018
// This code will demonstrate 5 standards violations
// UPDATE: Fixed by Ethan Yoder on 1/23/2018

public class KatCode {

	public static void main(String[] args) throws FileNotFoundException {

		/*
		 * #1 
		 * NUM09-J. Do not use floating-point variables as loop counters
		 * https://wiki.sei.cmu.edu/confluence/display/java/NUM09-J.+Do+not+use+floating-point+variables+as+loop+counters
		 * FIXED
		 */

		for (int x = 1; x <= 1; x ++) { //changed float declarations to integer declarations to fix - Ethan Yoder
			System.out.println("Meow # " + x);
		}

		/*
		 * #2 
		 * OBJ54-J. Do not attempt to help the garbage collector by setting local
		 * reference variables to null
		 * https://wiki.sei.cmu.edu/confluence/display/java/OBJ54-J.+Do+not+attempt+to+help+the+garbage+collector+by+setting+local+reference+variables+to+null
		 * FIXED
		 */

		int[] array = new int[5];
		for (int x = 0; x < 5; x++)
			array[x] = x + 1;
		for (int x = 0; x < 5; x++)
			System.out.println(array[x]);
		//removed array = null statement to fix - Ethan Yoder

		/*
		 * #3 
		 * MSC57-J. Strive for logical completeness
		 * https://wiki.sei.cmu.edu/confluence/display/java/MSC57-J.+Strive+for+logical+completeness
		 * FIXED
		 */

		int age = 19;
		if (age < 18)
			System.out.println("Child");
		else if (age > 21)
			System.out.println("Adult");
		else
			System.out.println("Neither child or adult"); //added else to handle case 18-21 age range.  Fixed - Ethan Yoder

		/*
		 * #4 
		 * MSC51-J. Do not place a semicolon immediately following an if, for, or
		 * while condition
		 * https://wiki.sei.cmu.edu/confluence/display/java/MSC51-J.+Do+not+place+a+semicolon+immediately+following+an+if%2C+for%2C+or+while+condition
		 * FIXED
		 */
		String pet = "cat";
		if (pet == "cat")
		{ //removed the semicolon to fix - Ethan Yoder
			System.out.println("Cute!");
		}

		/*
		 * #5 
		 * FIO50-J. Do not make assumptions about file creation
		 * https://wiki.sei.cmu.edu/confluence/display/java/FIO50-J.+Do+not+make+assumptions+about+file+creation
		 * FIXED
		 */
		try { //added try-catch block to handle file creation errors.  Fixed - Ethan Yoder
			PrintWriter out = new PrintWriter("file.txt");
			out.println("Hello (cruel) World");
			out.close();
		}
		catch (IOException e) {
			System.out.println("File creation error")
		}
		
	}
}
