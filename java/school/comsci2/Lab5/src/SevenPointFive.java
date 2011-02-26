import java.util.*;
public class SevenPointFive {
	public static void main(String[] args) {
		
	
		double[][] userArray1 = getMatrix("one");
		double[][] userArray2 = getMatrix("two");
		double[][] result = addMatrix(userArray1, userArray2);
		
		System.out.println("Matrix One");
		printMatrix(userArray1);
		
		System.out.println("\nMatrix Two");
		printMatrix(userArray2);
		
		System.out.println("\nThe sum of the matricies is: ");	
		
		printMatrix(result);
	}

	public static double[][] addMatrix(double[][]a,double[][]b) {
		double[][] result = new double [a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	
	private static double[][] getMatrix(String name) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many rows in matrix " + name + "?");
		int rows = console.nextInt();
		System.out.println("How many columns in matrix " + name + "?");
		int columns = console.nextInt();
		double[][] array = new double [rows][columns];
		
	    for(int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array[i].length; j++) {
	              System.out.println("Enter numbers for matrix " + name + ": ");
	              array[i][j] = console.nextDouble();
	         }
	    }
	    return array;
	}
	
	private static void printMatrix(double[][] matrixToPrint) {
	    for(int i = 0; i < matrixToPrint.length; i++) {
	         for (int j = 0; j < matrixToPrint[i].length; j++) {
					System.out.print(matrixToPrint[i][j] + " ");
					if (j == 2)
						System.out.print("\n");
	         }
	    }
	}

}
