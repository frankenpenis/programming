//Programmer Name: Tyler Groves
//Course: Computer Science II
//Assignment: Lab 3
//Due Date: Thursday, February 8.
//File name: SixPointSixteen.java
import java.util.*;
public class SixPointSixteen {
	
	public static void main(String[] args) {
		
		//Generate Array
		Random randNum = new Random();
		int [] myArray = new int [10000000];
		int key = randNum.nextInt(1000)+1;
		for (int i = 0;i < myArray.length;i++) {
			myArray[i] = randNum.nextInt(10000)+1;
		}
		
		//Linear Search
		System.out.println("Looking for " + key + " in myArray using linear search.");
		long startTime = System.currentTimeMillis();
		int result = linearSearch(myArray, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println(key + " found at element " + result + " in " + executionTime + " milliseconds.");
		
		//Sorting Array
		System.out.println("Sorting the array");
		startTime = System.currentTimeMillis();
		selectionSort(myArray);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Array sorted in " + executionTime + " milliseconds.");
		
		//Binary Search
		System.out.println("Looking for " + key + " in myArray using binary search.");
		startTime = System.currentTimeMillis();
		int binaryResult = binarySearch(myArray, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(key + " found at element " + binaryResult + " in " + executionTime + " milliseconds.");
		
		
		
	}
	
	public static int linearSearch(int []list, int key) {
		for(int i=0;i < list.length;i++) {
			if (key == list[i]) {
				return i;
			}
		}
		return -1;
	}
	public static void selectionSort(int []list) {
		for(int i=0; i < list.length -1; i++) {
			int currentMin = list[i];
			int currentMinIndex = i;
			
		for(int j=i + 1;j < list.length; j++) {
			if(currentMin > list[j]) {
				currentMin = list[j];
				currentMinIndex = j;
				}
			}
		if(currentMinIndex != i) {
			list[currentMinIndex] = list[i];
			list[i] = currentMin;
			}
		}
	}
	public static int binarySearch(int[]list, int key) {
		int low = 0;
		int high = list.length -1;
		while(high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return - low - 1;
	}

}
