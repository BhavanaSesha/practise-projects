package service.interfaces;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Bike;

public interface BikeInterface {
	public long findLeastPrice(ArrayList<Bike> bikes);
	public long findMaxPrice(ArrayList<Bike> bikes);
	public void addBikes(ArrayList<Bike> bikes, Scanner sc);

}
