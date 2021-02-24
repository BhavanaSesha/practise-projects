package service;

import java.util.ArrayList;
import java.util.Scanner;

import entity.InternetPlan;
import entity.InternetUser;

public class InternetProviderApplication extends BikeShowRoomApplication{



	public void addNewPlan(Scanner sc, ArrayList<InternetPlan> internetPlans) {
		System.out.println("Enter plan name: ");
		String planName = sc.nextLine();
		System.out.println("Enter internet speed :");
		String internetSpeed = sc.nextLine();
		System.out.println("Enter Monthly Download Limit: ");
		String downloadLimit = sc.next();
		System.out.println("Enter price per month: ");
		int price = sc.nextInt();
		InternetPlan internetPlan = new InternetPlan(planName,internetSpeed,downloadLimit,price);
		//return internetPlan;
		internetPlans.add(internetPlan);
	}

	public void addNewUser(ArrayList<InternetUser> internetUsers, Scanner sc) {
		System.out.println("Enter name of the user : ");
		String name = sc.nextLine();
		System.out.println("Enter user id: ");
		String userId = sc.nextLine();
		System.out.println("Enter mobile number: ");
		long  mobileNumber = sc.nextLong();
		System.out.println("Enter City :");
		sc.nextLine();
		String city = sc.nextLine();
		System.out.println("Enter Internet plan : ");
		InternetPlan internetPlan = this.addNewPlan(sc);
		InternetUser internetUser = new InternetUser(name,userId,mobileNumber,city,internetPlan);
		internetUsers.add(internetUser);
		
	}

	public InternetPlan addNewPlan(Scanner sc) {
		System.out.println("Enter plan name: ");
		String planName = sc.nextLine();
		System.out.println("Enter internet speed :");
		String internetSpeed = sc.nextLine();
		System.out.println("Enter Monthly Download Limit: ");
		String downloadLimit = sc.next();
		System.out.println("Enter price per month: ");
		int price = sc.nextInt();
		InternetPlan internetPlan = new InternetPlan(planName,internetSpeed,downloadLimit,price);
		return internetPlan;
		
	}

	public void displayUsers(ArrayList<InternetUser> internetUsers, Scanner sc) {
		System.out.println("Enter internet plan name: ");
		String name = sc.nextLine();
		for(InternetUser internetUser:internetUsers)
		{
			if(internetUser.getInternetPlan().getPlanName().equals(name))
				System.out.println(internetUser);
			else
				System.out.println();
		}
	}

	public String reverseCity(ArrayList<InternetUser> internetUsers, Scanner sc) {
		System.out.println("Enter user id");
		String userId = sc.next();
		String newCity="";
		for(InternetUser internetUser:internetUsers)
		{
			if(internetUser.getUserId().equals(userId))
			{
				String city = internetUser.getCity();
				newCity="";
				for(int i = city.length()-1;i>=0;i--)
					newCity=newCity+city.charAt(i);
			}
		}
		return newCity;
	}

}
