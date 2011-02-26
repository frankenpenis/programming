import java.util.*;
public class sevenPointFive {
public static void main (String[]args){
         double [][]a = new double [3][3];
         double [][]b = new double [3][3];
         double [][]c;
         c=addMatrix(a,b);
        
         Scanner input = new Scanner(System.in);
        
         System.out.println("Please enter "+a.length+" rows, and"+a[0].length+" columns.");
         for(int row=0;row<a.length;row++){
                 for(int column=0;column<a[row].length;column++){
                         a[row][column]=input.nextInt();
                 }
         }
         System.out.println("Please enter "+b.length+" rows, and"+b[0].length+" columns.");
         for(int row=0;row<b.length;row++){
                 for(int column=0;column<b[row].length;column++){
                         b[row][column]=input.nextInt();
                 }
         }
         System.out.println("The sum of the two matrices is "+c);
        
        
}


         public static double [][] addMatrix(double[][]a,double[][]b){
                 double[][]c = new double[a.length][b.length];
                
                 for (int i=0; i<a.length; i++)
                         for(int j=0;j<a[0].length;j++)
                                 c[i][j]=a[i][j]+b[i][j];
                 return c;
                
         }

}