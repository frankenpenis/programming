/*Programming Assignment #2 Item 2
 * Tyler J Groves
 * 8/26/2010
 * COMSC1033 MWF 11AM
 */

import javax.swing.*;
import java.text.*;
public class itemTwo {

	public static void main(String[] args) {
	DecimalFormat round = new DecimalFormat("#.##");	
	
	// Get input for the two sides then convert the strings to integers.
	String strSideA = JOptionPane.showInputDialog(null, "Enter the first side");
	String strSideB = JOptionPane.showInputDialog(null, "Enter the second side");
	double sideA = Double.parseDouble(strSideA);
	double sideB = Double.parseDouble(strSideB);
	
	// Instantiate triangle object
	Triangle myTri = new Triangle(sideA, sideB);
	
	//Output
	JOptionPane.showMessageDialog(null, "The area of the triangle is: " + round.format(myTri.getArea()));
		

	}

}
