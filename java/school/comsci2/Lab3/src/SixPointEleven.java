//Programmer Name: Tyler Groves
//Course: Computer Science II
//Assignment: Lab 3
//Due Date: Thursday, February 8.
//File name: SixPointEleven.java
import java.util.Scanner;
public class SixPointEleven {

	public static void main(String[] args) {
		
		double [] userArray = new double [10];
		Scanner console = new Scanner(System.in);
		
		for (int i = 0;i < userArray.length; i++) {
			System.out.println("Enter ten numbers: ");
			userArray[i] = console.nextDouble();
		}
		double mean = mean(userArray);
		System.out.println("The mean is:  " + mean);
		double deviation = deviation(userArray);
		System.out.println("The deviation is:  " + deviation);
		
	}
	
	public static double mean (double [] x) {
		double sum=0.0;
		double mean;	
		for (int count = 0; count < 10; count ++)
		{
		double number = x[count];
		sum += number;
		}
		mean = sum / 10.0;
		return mean;
		
	}
	
	public static double deviation (double [] x) {
		double sum = 0.0;
		double mean = mean(x);
		double dev;
		
		for (int i = 0; i < x.length; i++)
		{ 
		sum += Math.pow((x[i] - mean),2);
		}

		dev = Math.sqrt(sum / x.length);
		return dev;	
	} 
}
