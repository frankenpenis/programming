import java.util.*;
public class SixPointEight {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		double [] inputArray = new double [10];
		
		for(int i=0;i < inputArray.length; i++) {
		System.out.print("Please enter 10 numbers: ");
		inputArray[i] = console.nextDouble();
		}
		double mean = average(inputArray);
		System.out.println("The average is " + mean);
	}

	public static int average(int[] intArray) {
		int sum = 0;
		for (int i=0;i < intArray.length;i++) {
			sum+=intArray[i];
		}
		return sum/intArray.length;
	}
	public static double average(double[] doubleArray) {
		int sum = 0;
		for(double element : doubleArray) {
			sum+=element;
		}
		return sum/doubleArray.length;
	}
}
