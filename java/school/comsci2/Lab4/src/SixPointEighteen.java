
public class SixPointEighteen {
	public static void main(String[] args) {
	double [] arrayList = { 6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5 };
	bubbleSort(arrayList);
	
	for (int i = 0; i < arrayList.length; i++)
	System.out.print(arrayList[i] + " ");

	}
		 
		 public static void bubbleSort(double [] arrayList) {
			 boolean nextPass = true;
			 for (int k = 1; k < arrayList.length && nextPass; k++){
				 
				 nextPass = false;
				 for (int i = 0; i < arrayList.length - k; i++){
					 if (arrayList[i] > arrayList[i + 1]) {
						 
						 double temp = arrayList[i];
						 arrayList[i] = arrayList[i +1];
						 arrayList [i +1] = temp;
						 nextPass = true;	
				 }
				 
			 }
		 }
	 }
}
