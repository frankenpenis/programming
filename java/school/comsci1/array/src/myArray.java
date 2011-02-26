import java.util.*;
public class myArray {

	public static void main(String[] args) {
		Random randNum = new Random();
		int [] myArray = new int [1000];
		int oneCount = 0, twoCount = 0, threeCount = 0, fourCount = 0, fiveCount = 0, sixCount = 0;
		
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = randNum.nextInt(6)+1;
			if (myArray[i] == 1) { oneCount++; }
			if (myArray[i] == 2) { twoCount++; }
			if (myArray[i] == 3) { threeCount++; }
			if (myArray[i] == 4) { fourCount++; }
			if (myArray[i] == 5) { fiveCount++; }
			if (myArray[i] == 6) { sixCount++; }
		} //end loop
		System.out.println("There are " + oneCount + " ones");
		System.out.println("There are " + twoCount + " ones");
		System.out.println("There are " + threeCount + " ones");
		System.out.println("There are " + fourCount + " ones");
		System.out.println("There are " + fiveCount + " ones");
		System.out.println("There are " + sixCount + " ones");
		

	}

}
