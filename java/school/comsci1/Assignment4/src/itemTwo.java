/*Programming Assignment #4  Item 2
 * Tyler Groves
 *  10/29/10
 */
import java.io.*;
import java.util.*;
public class itemTwo {
	public static void main(String[] args) throws IOException {
		File inputFile = new File("MailingList.txt");
		Scanner console = new Scanner(inputFile);
		PrintWriter goodList = new PrintWriter("GoodMailingList.txt");
		PrintWriter badList = new PrintWriter("BadMailingList.txt");
		int goodCount = 0;
		int badCount = 0;
		
		while (console.hasNext()) {
			int atCount = 0;
			String email = console.next();
			for(int i = 0;i < email.length(); i++) {
				if(email.charAt(i) == '@') {
					atCount++;
				}
			}
		if (atCount == 1) {
			 goodCount++;
				goodList.println(email);
		} 
		else 
		{
			badCount++;
			badList.println(email);
		}
	}
	System.out.println("Good Emails: " + goodCount);
	System.out.println("Bad Emails: " + badCount);	
	goodList.close();
	badList.close();
		
	}
}
