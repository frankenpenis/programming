/*Programming Assignment #2 Item 2
 * Tyler J Groves
 * 8/26/2010
 * COMSC1033 MWF 11AM
 */
 
 public class Triangle
 {
 	private double side1;
 	private double side2;
 	private double hypotenuse;
 	
 	public Triangle(double sideOne, double sideTwo)
 	{//Round parameters to two decimal places before storing in instance variables
 	 side1=(int) (sideOne*100)/100.0;
 	 side2=(int)(sideTwo*100)/100.0;
 	 //Add a statement here to calculate the hypotenuse
 	hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);
 	 
 		
 	}//end constructor
 	public double getSide1()
 	 {return side1;
 	 }
 	public double getSide2()
 	 {return side2;
 	 } 
 	public double getHypotenuse()
 	 {return hypotenuse;
 	 }
 	public double getArea()
 	 {double halfSidesSum;
 	  double area;
 	  //add statements here to calculate halfSidesSum and area
 	 halfSidesSum = (side1 + side2 + hypotenuse)/2;
 	 area = Math.sqrt(halfSidesSum *( halfSidesSum - side1)*( halfSidesSum - side2)*( halfSidesSum - hypotenuse));
 	  return area;
 	 }
 	 
 }//end class