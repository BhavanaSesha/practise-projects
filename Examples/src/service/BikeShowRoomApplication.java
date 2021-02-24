package service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import entity.Bike;
import service.interfaces.BikeInterface;

public class BikeShowRoomApplication implements Comparator<Bike>,BikeInterface{
	Utility utility = new Utility();

	public void addBikes(ArrayList<Bike> bikes, Scanner sc) {
		System.out.println("Enter the makers of the bike");
		String make = utility.sentenceValidation(sc);
		System.out.println("Enter model of the bike: ");
		String model = utility.sentenceValidation(sc);
		System.out.println("Enter the type of the bike:");
		String type = utility.sentenceValidation(sc);
		System.out.println("Enter Engine CC: ");
		String engineCC = utility.sentenceValidation(sc);
		System.out.println("Enter price: ");
		long price = utility.longValidation(sc);
		Bike bike = new Bike(make,model,type,engineCC,price);
		bikes.add(bike);
	}

	public int compare(Bike bike1,Bike bike2) {
		int typeCompare = bike1.getType().compareTo(bike2.getType());
		int makeCompare = bike1.getMake().compareTo(bike2.getMake());
		if(typeCompare==0)
		{
			return ((makeCompare==0)?typeCompare:makeCompare);
		}
		else 
			return typeCompare;
	}

	public long findLeastPrice(ArrayList<Bike> bikes) {
		long leastPrice=bikes.get(0).getPrice();
		for(Bike bike:bikes)
		{
			if(leastPrice>bike.getPrice())
				leastPrice=bike.getPrice();
		}
		return leastPrice;
	}

	public long findMaxPrice(ArrayList<Bike> bikes) {
		long maxPrice=bikes.get(0).getPrice();
		for(Bike bike:bikes)
		{
			if(maxPrice<bike.getPrice())
				maxPrice=bike.getPrice();
		}
		return maxPrice;
	}


}
