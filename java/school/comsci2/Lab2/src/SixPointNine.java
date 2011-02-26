//Programmer Name: Tyler Groves
//Course: Computer Science II
//Assignment: Lab 2
//Due Date: January 13th, 2011
//File name: SixPointNineOutput.java

import java.util.Scanner;
public class SixPointNine {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		double [] inputArray = new double [10];
		
		for(int i=0;i < inputArray.length; i++) {
		System.out.print("Please enter 10 numbers: ");
		inputArray[i] = console.nextDouble();
		}
		double lowestElement = min(inputArray);
		System.out.println("The smallest element in your array is " + (int) lowestElement);
	}
	public static double min(double [] array) {
		double lowest = array[0];
		for(int i = 1;i < array.length; i++) 
			if(array[i] < lowest) { lowest = array[i]; }
		return lowest;
		
	}

}
