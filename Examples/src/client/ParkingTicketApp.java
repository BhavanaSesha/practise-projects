package client;

import java.util.Scanner;

import entity.ParkingTicket;
import service.ParkingTicketApplication;

public class ParkingTicketApp {

	public static void main(String[] args) {
		ParkingTicket slots[]=new ParkingTicket[100];
		Scanner sc = new Scanner(System.in);
		ParkingTicketApplication obj = new ParkingTicketApplication();
		boolean flag=true;
		int availability=0,count=0;
		String vehiclenumber="",vehicletime="";
		do
		{
			System.out.println("a.Automatically check for the availability\nb.Enter Vehicle Number\nc.Enter entry time of Vehicle\nd.Automatically allocate empty slot for parking\ne.exit");
			char choice=sc.next().charAt(0);
			sc.nextLine();
			switch(choice)
			{
			case 'a':availability = obj.checkAvailability(slots);
						if(availability>0)
							System.out.println("Slot is available"+availability);
						else
							System.out.println("SLot is unavialable");
						break;
			case 'b':vehiclenumber = obj.enterVehicleNumber(sc);
					ParkingTicket ticket = new ParkingTicket();
					ticket.setVehiclenumber(vehiclenumber);
					slots[count++]=ticket;
					//for(ParkingTicket i :slots)
						//System.out.println(i);
					
					 break;
			case 'c':obj.setVehicleTime(slots,count,sc);
					 //ParkingTicket parkobj = new ParkingTicket(vehiclenumber,vehicletime);
					 //slots[count++]=parkobj;
					 break;
			case 'd':for(int index=count+1;index<100;index++) {
				 		if(slots[index]==null)
				 		{
				 			System.out.println("Slot "+index+" is available for parking");
				 		}
				 		break;
						}
						break;
					
			case 'e':float fare=obj.calculateFare(slots,count,sc);
					 System.out.println(fare);
					 flag=false;
						
			
			}
		}while(flag);
		sc.close();
	}

}
