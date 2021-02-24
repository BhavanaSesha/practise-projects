package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entity.InternetPlan;
import entity.InternetUser;
import service.InternetProviderApplication;

public class InternetApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<InternetPlan>internetPlans = new ArrayList<InternetPlan>();
		ArrayList<InternetUser>internetUsers = new ArrayList<InternetUser>();
		InternetProviderApplication internetProviderApplication = new InternetProviderApplication();
		char choice;
		boolean exit = false;
		do
		{
			displayMenu();
			choice = sc.next().charAt(0);
			sc.nextLine();
			switch(choice)
			{
			case 'a': internetProviderApplication.addNewPlan(sc,internetPlans);
						break;
			case 'b': internetProviderApplication.addNewUser(internetUsers,sc);
						break;
			case 'c': for(InternetUser internetUser: internetUsers)
						System.out.println(internetUser);
						break;
			case 'd': for(InternetPlan internetPlan :internetPlans)
						System.out.println(internetPlan);
						break;
			case 'e': internetProviderApplication.displayUsers(internetUsers,sc);
						break;
			case 'f': String city = internetProviderApplication.reverseCity(internetUsers,sc);
					  System.out.println(city);
					  break;
			case 'g': Collections.sort(internetPlans);
					  //for(InternetPlan internetPlan :internetPlans)
						//  System.out.println(internetPlan);
							Iterator itr = internetPlans.iterator();
							while(itr.hasNext())
							{
								System.out.println(itr.next());
							}
					  break;
			case 'h':exit = true;
						
			
			}
			
			
		}while(!exit);
		sc.close();
	}
	public static void displayMenu() {
		System.out.println("a.Add new Plan: ");
		System.out.println("b. Add new User: ");
		System.out.println("c.Display all users: ");
		System.out.println("d.Display all plans available: ");
		System.out.println("e.Display all users subscribed to a particular plan: ");
		System.out.println("f.Display city name in reverse order: ");
		System.out.println("g.Sort the plan in based on ascending order of price: ");
		System.out.println("h.Exit");
	}

}
