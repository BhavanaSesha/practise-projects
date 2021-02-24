package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Bike;
import service.BikeShowRoomApplication;

public class BikeApp {

	public static void main(String[] args) {
		BikeShowRoomApplication bikeShowRoomApplication = new BikeShowRoomApplication();
		Scanner sc = new Scanner(System.in);
		ArrayList<Bike> bikes = new ArrayList<Bike>();
		int choice;
		boolean exit = false;
		do
		{
			displayMenu();
			choice=sc.nextInt();
			sc.nextLine();
			switch(choice)
			{
				case 1: bikeShowRoomApplication.addBikes(bikes,sc);
							break;
				case 2: Collections.sort(bikes);
							for(Bike bike : bikes)
								System.out.println(bike);
							break;
				case 3: Collections.sort(bikes, bikeShowRoomApplication);
							for(Bike bike:bikes)
								System.out.println(bike);
							break;
				case 4: long leastPrice = bikeShowRoomApplication.findLeastPrice(bikes);
							System.out.println("Least Price is "+leastPrice);
							long maxPrice = bikeShowRoomApplication.findMaxPrice(bikes);
							System.out.println("Max Price is "+maxPrice);
							break;
				case 5: exit = true;
							break;
				}
			
		}while(!exit);
		sc.close();
	}
	public static  void displayMenu()
	{
		System.out.println("1.Add a new Bike: ");
		System.out.println("2.Display the bikes sorted by make: ");
		System.out.println("3.Display the bikes first Sorted by Type and then Make: ");
		System.out.println("4.Find the least and most expensive bikes in the store: ");
		System.out.println("5.Exit");
	}

}
