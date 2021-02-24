package service;

import java.util.Scanner;

import entity.ParkingTicket;
import service.interfaces.ParkingTicketInterface;

public class ParkingTicketApplication implements ParkingTicketInterface{
	//Validate vobj1= new Validate();
	Utility utility = new Utility();

	public float calculateFare(ParkingTicket[] slots, int availability, Scanner sc2) {
		// TODO Auto-generated method stub
		System.out.println("Enter Vehicle number");
		String vehnumber =utility.sentenceValidation(sc2);
		int k2 = 0;
		for(int i = 0;i<availability;i++)
		{
			if(slots[i].getVehiclenumber().equals(vehnumber))
			{
				k2=i;
				break;
			}
		}
		String entrytime=slots[k2].getEntrytime();
		System.out.println("Enter exit time");
		String exittime=utility.timeValidation(sc2);
		int exithrs = 0,exitmin = 0,k=0,j;
		float fare;
		for(j = 0;j<exittime.length();j++)
		{
			if(exittime.charAt(j)!=':')
			{
				exithrs=exithrs*10+((int)(exittime.charAt(j)-48));
			}
			else
			{
				k=j+1;
				break;
			}
		}
		while(k<exittime.length())
		{
			
			exitmin=exitmin*10+(int)(exittime.charAt(k)-48);
			k++;
		}

		int entryhrs = 0,entrymin = 0,k1=0,j1;
		for(j1 = 0;j1<entrytime.length();j1++)
		{
			if(entrytime.charAt(j1)!=':')
			{
				entryhrs=entryhrs*10+((int)(entrytime.charAt(j1)-48));
			}
			else
			{
				k1=j1+1;
				break;
			}
		}
		while(k1<entrytime.length())
		{
			
			entrymin=entrymin*10+(int)(entrytime.charAt(k1)-48);
			k1++;
		}
		float farehrs=entryhrs-exithrs;
		float faremin=entrymin-exitmin;
		farehrs=(farehrs<0?-farehrs:farehrs);
		faremin=(faremin<0?-faremin:faremin);
		farehrs=farehrs+(faremin/60);
		/*System.out.println(faremin/60);
		System.out.println(farehrs);*/
		if(farehrs<=2)
		{
			fare=farehrs*50;
		}
		else
			fare=(farehrs-2)*30+2*50;
		
		return fare;
	}

	public  void setVehicleTime(ParkingTicket[] slots, int count, Scanner sc) {
		// TODO Auto-generated method stub
		//Validate vobj = new Validate();
		System.out.println("Enter vehicle number");
		String vehicleNumber = utility.sentenceValidation(sc);
		System.out.println("Enter vehicle entry time");
		String vehicleentrytime=utility.timeValidation(sc);
		boolean exists = true;
		for(ParkingTicket ticket1:slots)
		{
			if(ticket1!=null&&ticket1.getVehiclenumber().equals(vehicleNumber))
			{
				ticket1.setEntrytime(vehicleentrytime);
				exists = false;
			}
				
			//else
				//System.out.println("No vehicle with that number is present in the parking slot");
		}
		//slots[availability].setEntrytime(vehicleentrytime);
		if(exists)
			System.out.println("Vehicle with given vehicle number is not in parking slot");
		
	}

	public  String enterVehicleNumber(Scanner sc) {
		// TODO Auto-generated method stub
		//Validate vobj = new Validate();
		System.out.println("Enter vehicle number");
		String vehiclenumber=utility.sentenceValidation(sc);
		return vehiclenumber;
	}


	public int checkAvailability(ParkingTicket[] slots) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i = 0;i<slots.length;i++)
		{
			if(slots[i]==null)
			{
				index=i;
				break;
			}
		}
		index=index+1;
		return index;
	}

}
