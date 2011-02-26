import java.util.Scanner;
public class SixPointTen {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double [] inputArray = new double [10];
		
		for(int i=0;i < inputArray.length; i++) {
		System.out.print("Please enter 10 numbers: ");
		inputArray[i] = console.nextDouble();
		}
		double smallestIndex = indexOfSmallestElement(inputArray);
		System.out.println("The index of the smallest element is " + (int) smallestIndex);
	}
	public static int indexOfSmallestElement(double [] intArray) {
		int lowest = (int) intArray[0];
		int lowestIndex = 0;
		for(int i = 1;i < intArray.length; i++) 
			if(intArray[i] < lowest) { lowest = (int) intArray[i]; lowestIndex = i; }
		return lowestIndex;
	}

}
