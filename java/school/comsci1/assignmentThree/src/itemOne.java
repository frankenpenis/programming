import java.util.*;
import java.text.*;
public class itemOne {

	public static void main(String[] args) {
		
		double serviceCharge = 0;
		double loanAmount;
		double mIR = 0;
		double monthlyPayment;
		double iRate = 0;
		String yearsToRepay;
		char loanType;
		char creditStatus;
		
		Scanner console = new Scanner(System.in);
		DecimalFormat currency = new DecimalFormat("$###,###.00");
		
		System.out.println(" How many thousands of dollars do you want to borrow? (For $120,000, enter 120)");
		loanAmount = console.nextDouble();
		
		
		System.out.println(" How many years will it take to repay the loan?");
		yearsToRepay = console.next();
		int years = Integer.parseInt(yearsToRepay);
		
		System.out.println("What type of loan do you want?");
		System.out.println(" (F)irst home loan");
		System.out.println(" (H)ome improvement loan");
		System.out.println(" (C)ar loan");
		System.out.println(" (P)ersonal loan");
		System.out.println(" (B)usiness loan");
		System.out.println("Enter a letter");
		loanType = console.next().charAt(0);
		
		switch (loanType) 
		{
		case 'F':
		case 'f':
			iRate = 4.75;
			mIR = 4.75/100/12;
			break;
		case 'H':
		case 'h':
			iRate = 5.25;
			mIR = 5.25/100/12;
			break;
		case 'C':
		case 'c':
			iRate = 8.25;
			mIR = 8.25/100/12;
			break;
		case 'P':
		case 'p':
			iRate = 9.5;
			mIR = 9.5/100/12;
			break;
		case 'B':
		case 'b':
			iRate = 6.0;
			mIR = 6.0/100/12;
			break;
		default:
			System.out.println("Invalid Letter!");
		}
		
		System.out.println("What is your credit status?");
		System.out.println(" (P)oor");
		System.out.println(" (F)air");
		System.out.println(" (G)ood");
		System.out.println(" (E)xcellent");
		System.out.println(" Enter a letter");
		creditStatus = console.next().charAt(0);
	
		
		switch (creditStatus) {
		case 'P':
		case 'p':
			serviceCharge = (loanAmount * .03);
			break;
		case 'F':
		case 'f':
			serviceCharge = (loanAmount * .02);
			break;
		case 'G':
		case 'g':
			serviceCharge = (loanAmount * 0.1);
			break;
		case 'E':
		case 'e':
			serviceCharge = 0;
			break;
		default:
			System.out.println("Invalid Letter!");
		}
		loanAmount = loanAmount + serviceCharge;
		monthlyPayment = loanAmount * Math.pow(1.0 + mIR, years * 12);
		
		System.out.println("Intrest rate: " + iRate);
		System.out.println("Total Loan Amount: " + currency.format(loanAmount * 1000));
		System.out.println("Service Charge: " + currency.format(serviceCharge));
		System.out.println("Monthly Payment: " + currency.format(monthlyPayment));
		
		
	}
}

		
		

		
		
	