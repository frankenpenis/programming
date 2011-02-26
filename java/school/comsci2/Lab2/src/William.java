
public class William {
	public static void main(String[] args) {
		int [] array = { 65, 9, 29, 40, 58, 42, 90, 59, 76 };
		selectionSort(array);
		for (int i=0;i < array.length;i++)
			System.out.print(array[i] + " ");
		
		System.out.println ("\n Reversing");
		int [] reverseArray = reverse(array);
		for (int i=0;i < reverseArray.length;i++)
			System.out.print(reverseArray[i] + " ");
		
		int key = 59;
		int binaryResult = binarySearch(array, key);
		System.out.println("\n Key found at " + binaryResult);
		int min = findMin(array);
		System.out.println("The lowest element is " + min);
		int max = findMax(array);
		System.out.println("The highest element is " + max);
		int average = average(array);
		System.out.println("The average of the array is " + average);
	}
	
	public static void bubbleSort(int[]list) {
		boolean nextPass = true;
		for (int k=1; k < list.length && nextPass;k++){
			nextPass = false;
			for (int i=0; i < list.length - k; i++) {
				if (list[i] > list[i+1]) {
					int temp = list[i];
					list[i] = list[i+1];
					list[i+1] = temp;
					nextPass = true;
				}
			}
			
		}
	}
	public static void selectionSort(int[]list) {
		for (int i = 0; i < list.length - 1;i++){
			int currentMin = list[i];
			int currentMinIndex = i;
			for (int j = i + 1;j < list.length; j++) {
				if(currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
	public static int[] reverse(int[]list){
		int[] result = new int [list.length];
		for(int i = 0, j = result.length -1;i < list.length;i++, j--) {
			result[j] = list[i];
		}
		return result;
		
	}
	public static int binarySearch(int[]list, int key) {
		int low = 0;
		int high = list.length - 1;
		while(high >=low) {
			int mid = (high+low) / 2;
			if (key < list[mid]) {
				high = mid - 1;
			}
			else if(key == list[mid])
				return mid;
			else {
				low = mid + 1;
			}
		}
		return - low - 1;
	}
	public static int findMin(int[]list) {
		int min = list[0];
		for (int i=0;i < list.length; i++) {
			if(min > list[i]){
				min = list[i];
			}
		}
		return min;
	}
	public static int findMax(int[]list) {
		int max = list[0];
		for (int i=0;i < list.length; i++) {
			if(max < list[i]){
				max = list[i];
			}
		}
		return max;
	}
	public static int average(int[]list) {
		int sum = 0;
		for(int i=0;i < list.length; i++) {
			sum += list[i];
		}
		return sum/list.length;
	}

}
