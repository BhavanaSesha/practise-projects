package service.interfaces;

import java.util.Scanner;

import entity.ParkingTicket;

public interface ParkingTicketInterface {
	public float calculateFare(ParkingTicket[] slots, int availability, Scanner sc2);
	public  void setVehicleTime(ParkingTicket[] slots, int count, Scanner sc);
	public  String enterVehicleNumber(Scanner sc);
	public int checkAvailability(ParkingTicket[] slots) ;
	

}
