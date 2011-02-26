import java.util.*;
public class Lab2 {
	public static void main(String[] args) {
		Random randNum = new Random();
		int [] myArray = new int [1000];
		int [] count = new int [101];
		
		for (int i = 0;i < myArray.length;i++) 
			myArray[i] = randNum.nextInt(100)+1;
		for (int i=0; i< myArray.length; i++) 
			count[ myArray[i] ]++;
		for (int i = 1; i < count.length; i++)
			System.out.println("There are " + count[i] + " of " + i + "'s in myArray");
		
	}
}
