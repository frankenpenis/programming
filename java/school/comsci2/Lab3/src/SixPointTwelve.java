//Programmer Name: Tyler Groves
//Course: Computer Science II
//Assignment: Lab 3
//Due Date: Thursday, February 8.
//File name: SixPointTwelve.java
import java.util.*;
public class SixPointTwelve {
	public static void main(String [] args) {
		int [] userArray = new int [10];
		Scanner console = new Scanner(System.in);
		for (int i = 0;i < userArray.length; i++) {
			System.out.println("Enter ten numbers: ");
			userArray[i] = console.nextInt();
		}
		int[] reverseArray = reverse(userArray);
		for (int i=0;i < userArray.length; i++) {
			System.out.print(reverseArray[i] + " ");
		}
		
		
	}
	public static int[] reverse(int[] list) {
		  int[] result = new int[list.length];
		  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
		    result[j] = list[i];
		  }
		  return result;
		}
}