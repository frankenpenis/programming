/*Programming Assignment #4  Item 3
 * Tyler Groves
 *  10/29/10
 */
import java.util.*;
public class itemThree {
	public static void main(String[] args) {
		int rows;
		int columns;
		Random randNum = new Random();
		
		
		for(rows = 1; rows <= 8; rows++) {
			for(columns = 1; columns <= 10; columns++) {
				int treasure = randNum.nextInt(6);
				if (treasure == 0) {
				    System.out.println("Treasure found on row " + rows + ", column " + columns + ".");
					}
			}
		
			
		} //end loop
	} //end main

} //end class
	
