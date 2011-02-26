import java.util.*;
public class TicketClient {
	public static void main(String[] args) {
		Random randNum = new Random();
		int i = 1;
		int roadChance;
		int randSpeed;
		int randType;
		
		System.out.printf("%12s%15s%15s%16s%8s", "Ticket Number", "Speed Limit", "Vehicle Speed", "Classification", "Fine\n");
		
		while (i <= 30){
			randType = randNum.nextInt(4) + 1;
			randSpeed = randNum.nextInt(31) + 10;
			roadChance = randNum.nextInt(100) + 1;
			Ticket aTicket = new Ticket(randSpeed, 0, randType);
			
			if (roadChance <= 60) {
				aTicket.setSpeedLimit(20);
			}
			else if(roadChance > 60 && roadChance <= 90) {
				aTicket.setSpeedLimit(30);
			}
			else if(roadChance > 90 && roadChance <= 100) {
				aTicket.setSpeedLimit(40);
				
			}
			
			Ticket.addTicket();
			
			System.out.printf("%6d%17d%13d%16d%14.2f%1s", Ticket.getTicketTotal(), aTicket.getSpeedLimit(), aTicket.getVehicleSpeed(), aTicket.getStudentType(), aTicket.getFine(), "\n");
			
			i++;
			
		}//end while

	}//end main

}//end class
