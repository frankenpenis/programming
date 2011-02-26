/* 
 * Tyler J Groves
 * COMSC1033 MWF 11AM
 * Chapter 2 
 * Java data types and their values.
 */

public class DataTypeValues 
{
	public static void main(String[] args) 
	{
		// Define variables
		byte minByte = Byte.MIN_VALUE, maxByte = Byte.MAX_VALUE;
		short minShort = Short.MIN_VALUE, maxShort = Short.MAX_VALUE;
		long minLong = Long.MIN_VALUE, maxLong = Long.MAX_VALUE;
		
		// Output
		System.out.println("The minimum value of byte is " + minByte);
		System.out.println("The maximum value of byte is " + maxByte + "\n");
		
		System.out.println("The minimum value of short is " + minShort);
		System.out.println("The maximum value of short is " + maxShort + "\n");
		
		System.out.println("The minimum value of long is " + minLong);
		System.out.println("The maximum value of long is " + maxLong);
	}

}
