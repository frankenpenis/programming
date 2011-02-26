/*Programming Assignment #2 Item 1
 * Tyler J Groves
 * 8/26/2010
 * COMSC1033 MWF 11AM
 */
import java.io.*;
import java.util.*;
public class itemOne {

	public static void main(String[] args) throws IOException {
		
	// Instantiate Objects
	FileReader fr = new FileReader("Accounts.txt");
	PrintWriter pw = new PrintWriter("CurrentAccounts.txt");
	Scanner console = new Scanner(fr);
	
	
	// Pull information from Accounts.txt into Strings
	String fullName = console.next();
	String lastName = fullName.substring(0, 9);
	String firstName = fullName.substring(10, 17);
	String accountBalance = console.next();
	String sWholeValue = accountBalance.substring(0, 4);
	String sDecimalValue = accountBalance.substring(5, 8);
	
	// Convert accountBalance from one string variable into two integer variables
	int wholeValue = Integer.parseInt(sWholeValue);
	int decimalValue = Integer.parseInt(sDecimalValue);
	
	// Write 
	pw.printf("%15s %14s%06d%06d", firstName, lastName, wholeValue, decimalValue);
	
	// Close Streams
	fr.close();
	pw.close();
	
	}

}