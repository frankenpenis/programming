/*Programming Assignment #4  Item 1
 * Tyler Groves
 *  10/29/10
 */
public class itemOne {
	public static void main(String[] args) {
		int num = 1;
		int denum = 30;
		int sum = 0;
		while(denum != 0) {
			sum += num/denum;
			num++;
			denum--;
		}
		System.out.println(sum);

	}

}
