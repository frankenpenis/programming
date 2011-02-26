
public class Ticket {
	private int vehicleSpeed;
	private int speedLimit;
	private double fine = 0;
	private int studentType;
	private int overLimit;
	static int totalTickets;
	
	
	
	//constructors
	public Ticket() {
		vehicleSpeed = 0;
		speedLimit = 20;
		studentType = 1;
	}
	public Ticket(int aSpeed, int aSpeedLimit, int aStudentType) {
		vehicleSpeed = aSpeed;
		speedLimit = aSpeedLimit;
		studentType = aStudentType;
	}
	
	//accessors
	public int getVehicleSpeed() {
		return vehicleSpeed;
	}
	public int getSpeedLimit() {
		return speedLimit;
	}
	public double getFine() {
		this.calculateFine();
		return fine;
	}
	public int getStudentType() {
		return studentType;
	}
	
	public static int getTicketTotal() {
		return totalTickets;
	}
	
	//mutators
	public void setVehicleSpeed(int aVehicleSpeed) {
		vehicleSpeed = aVehicleSpeed;
	}
	public void setSpeedLimit(int aSpeedLimit) {
		speedLimit = aSpeedLimit;
	}
	public void setFine(double aFine) {
		fine = aFine;
	}
	public void setStudentType(int aStudentType) {
		studentType = aStudentType;
	}
	
	public static void addTicket() {
		totalTickets++;
	}
	
	private void calculateFine() {
		overLimit = vehicleSpeed - speedLimit;
		
		if (overLimit > 0) {
			fine = 40 + (overLimit/5*10); 
			if (studentType == 1 && overLimit < 20) {
				fine -= 20;
			}
			if (studentType == 4 && overLimit < 20) {
				fine += 25;
			}
			if (studentType == 4 && overLimit > 20) {
				fine += 100;
			}
			if (!(studentType == 4) && overLimit > 20) {
				fine += 50;
			}
		}//end if
		else {
			fine = 0;
		}
		
		
		
		
		
	}

	
}//end class
