
import javax.swing.*;

public class testOne 
{
	public static void main(String[] args) 
	{
		String numInput1 = JOptionPane.showInputDialog(null, "Give me a number to add.");
		String numInput2 = JOptionPane.showInputDialog(null, "Give me another number to add.");
		int num1 = Integer.parseInt(numInput1), num2 = Integer.parseInt(numInput2);
		int result = num1 + num2;
		JOptionPane.showMessageDialog(null, "The sum of " + num1 + " and " + num2 + " is " + result);
	}

}
