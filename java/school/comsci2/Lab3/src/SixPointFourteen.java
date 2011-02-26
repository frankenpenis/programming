//Programmer Name: Tyler Groves
//Course: Computer Science II
//Assignment: Lab 3
//Due Date: Thursday, February 8.
//File name: SixPointFourteen.java
import java.util.Scanner;
public class SixPointFourteen {
	public static void main(String[] args) {
		int [] userArray = new int [5];
		Scanner console = new Scanner(System.in);
		
		for (int i = 0;i < userArray.length; i++) {
			System.out.println("Enter five numbers: ");
			userArray[i] = console.nextInt();
		}
		int aInteger = gcd(userArray);
		System.out.println("The GCD is " + aInteger);
	}
		
		public static int gcd(int[]list){
			int gcd = 1;
			int k = 2;
			
			while (k <= list[4]){
				if (list[0] % k == 0 && list[1] % k == 0 && list[2] % k == 0 && list[3] % k == 0 && list[4] % k == 0)
					gcd = k;
				k++;
	}
			return gcd;

		}
}

