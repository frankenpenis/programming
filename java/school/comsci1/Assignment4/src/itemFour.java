/*Programming Assignment #4  Item 4
 * Tyler Groves
 *  10/29/10
 */
import java.util.*;
import java.io.*;
public class itemFour {
	public static void main(String[] args) throws IOException {
		File outputFile = new File("CompressedFileList.txt");
		File inputFile = new File("FileList.txt");
		PrintWriter output = new PrintWriter(outputFile);
		Scanner fileList = new Scanner(inputFile);
		Scanner console = new Scanner(System.in);
		int validChoice = 0;
		int currentSize = 0;
		int cartridgeSizeBytes = 0;
		int totalFiles = 0;
		
		while(validChoice != 1) {
			int input;
			System.out.println("What size cartridge?");
			System.out.println(" 1) 25,000 blocks");
			System.out.println(" 2) 50,000 blocks");
			System.out.print("Enter a number: ");
			input = console.nextInt();
			if (input == 1) { cartridgeSizeBytes = 12800000; validChoice = 1;}
			else if (input == 2) { cartridgeSizeBytes = 25600000; validChoice = 1;}
			else { System.out.println("Invalid input!"); }
				
		} //end while
		
		while(fileList.hasNext()) {
			String input = fileList.next();
			for(int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '.') {
					int fileByte = Integer.parseInt(input.substring(2, 8));
					int x = (int) (fileByte * .2);
					int compressedFileByte = fileByte - x;
					if(currentSize < cartridgeSizeBytes) {
						currentSize += compressedFileByte;
						totalFiles++;
						output.println("KB" + compressedFileByte + ".cat");
					}
				}
			}
		}// end while
		System.out.println("Total files: " + totalFiles);
	output.close();	
	fileList.close();
	}//end main
}//end class
