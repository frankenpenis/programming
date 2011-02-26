import java.text.*;
public class quiz {
	public static void main(String[] args) {
		double cost=1507.1;
		DecimalFormat curf = new DecimalFormat("$##,###.00");
		System.out.println(curf.format(cost));
	}

}
