import javax.swing.*;
public class itemTwo {
	public static void main(String [] args) {
		int x;
		int y;
		String input;
		
		input = JOptionPane.showInputDialog(null, "Enter an X coordinate.");
		x = Integer.parseInt(input);
		input = JOptionPane.showInputDialog(null, "Enter an Y coordinate.");
		y = Integer.parseInt(input);
		
		if (x == 0 && y == 0)
			System.out.println("The point " + x + "," + y + " is on the origin");
		else if (x > 0 && y > 0)
			System.out.println("The point " + x + "," + y + " is in the first quadrant");
		else if (x < 0 && y > 0)
			System.out.println("The point " + x + "," + y + " is in the second quadrant");
		else if (x < 0 && y < 0)
			System.out.println("The point " + x + "," + y + " is in the third quadrant");
		else if (x > 0 && y < 0)
			System.out.println("The point " + x + "," + y + " is in the fourth quadrant");
		else if (x==0 && y!=0)
			System.out.println("The point " + x + "," + y + " is on the Y axis");
		else if (x!=0 && y==0)
			System.out.println("The point " + x + "," + y + " is on the X axis");
		
	}

}
