import java.util.*;
public class SixPointTwentyFive {
	public static void main(String [] args) {
		Scanner console = new Scanner(System.in);
		double [] eqn = new double [3];
		double [] roots = new double[2];
		
		for (int i = 0;i < eqn.length;i++){
			System.out.println("Enter a coefficient: ");
			eqn[i] = console.nextDouble();
		}
		int numRoots = solveQuadratic(eqn, roots);
	    if (numRoots == -1)
			System.out.println("All x are solutions");
		    else if (numRoots==0)
			System.out.println("No roots");
		    else if (numRoots==1)
			System.out.println("One root. Solution is: x= "+roots[0]);
		    else if (numRoots==2)
			System.out.println("Two roots. Solutions are: X= "+roots[0]+" or X="+roots[1]);
		
	}
	public static int solveQuadratic(double[] eqn, double[] roots) {
		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];
		
		if (a==0&&b==0&&c==0)
		    return -1; 
		if (a==0&&b==0)
		    return 0;
		if (a==0) {
			roots[0] = -c/b;
		    return 1;
		}
		else {
		double discriminant = b*b-4*a*c;
		roots[0]=(-b+Math.sqrt(discriminant)/(2*a));
		roots[1]=(-b-Math.sqrt(discriminant)/(2*a));
		return 2;
		}
	}
}