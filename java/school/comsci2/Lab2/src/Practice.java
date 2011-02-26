import java.util.*;
public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] array = new int[10];
		
		for (int i = 0; i < array.length; i++){
			System.out.println("enter 10 dig");
			array[i] = input.nextInt();
			
			
			
		}
		int min = findMin(array);
		System.out.println(min);
	

	}
	
	public static int findMin(int [] list){
		int min = list[0];
	
	
		for (int i = 0; i < list.length; i++){
			if (min > list[i]){
				min = list[i];
				
			}
		}
		return min;

}
}
