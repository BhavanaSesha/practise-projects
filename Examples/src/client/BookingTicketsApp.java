package client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import entity.MovieDetails;
import service.BookingMovieTickets;
import service.Utility;

public class BookingTicketsApp {
Utility utility = new Utility();
	public static void main(String[] args) {
		List<MovieDetails>  movieDetails = new ArrayList<MovieDetails>();
		BookingMovieTickets bookingMovieTickets = new BookingMovieTickets();
		BookingTicketsApp bookingTicketsApp = new BookingTicketsApp();
		char choice;
		Utility utility = new Utility();
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		do
		{
			bookingTicketsApp.displayMenu();
			choice=utility.menuOptionValidation(sc);
			sc.nextLine();
			switch(choice)
			{
			case 'A': try
						{
							bookingMovieTickets.addMovieDetails(sc,movieDetails);
							
						}
						catch(Exception e)
						{
							System.out.println(e);
							//e.printStackTrace();
						}
						break;
							
							
			case 'B': bookingTicketsApp.displaySubMenu(sc,movieDetails);
							break;
			case 'C': bookingMovieTickets.deleteMovie(sc,movieDetails);
							break;
			case 'D':exit = true;
							break;
			
			}
		}while(!exit);
	}

	public void displaySubMenu(Scanner sc, List<MovieDetails> movieDetails) {
		byte choice;
		boolean exit = false;
		do
		{
			System.out.println("1.Sort movie by id \n2.Sort by rating \n3.Sort by Movie Name \n4.Search by Language \n5.Search by cast\n6.Exit");
			choice = utility.menuOptionByteValidation(sc);
			sc.nextLine();
			switch(choice)
			{
			case 1: Collections.sort(movieDetails,new  BookingMovieTickets());
					for(MovieDetails movie:movieDetails)
						System.out.println(movie);
					//System.out.println(movieDetails.size());
					break;
			case 2: Collections.sort(movieDetails, new MovieDetails());
					for(MovieDetails movie:movieDetails)
						System.out.println(movie);
					break;
			case 3: Collections.sort(movieDetails);
					for(MovieDetails movie:movieDetails)
						System.out.println(movie);
					break;
			case 4:System.out.println("Enter language of the movie you want to search");
				   String language = utility.stringValidation(sc);
				   Iterator itr = movieDetails.iterator();
					while(itr.hasNext())
					{
						MovieDetails object = (MovieDetails) itr.next();
						if(object.getLanguage().equalsIgnoreCase(language))
							System.out.println(object);
						else
							System.out.println("Movie with given languages are not there");
							
					}
					break;
			case 5: new  BookingTicketsApp().castSubMenu(sc,movieDetails);
						break;
			case 6:exit = true;
						break;
						
			}
			
		}while(!exit);
		
	}

	public void castSubMenu(Scanner sc, List<MovieDetails> movieDetails) {
		char choice;
		boolean exit = false;
		do
		{
			System.out.println("a.By hero name\nb.By heroine Name \nc.By Director name \nd.By musicDirector Name \ne.exit");
			choice = utility.menuOptionValidation(sc);
			sc.nextLine();
			switch(choice)
			{
			case 'a': System.out.println("Enter hero name");
						  String heroName = utility.sentenceValidation(sc);
							Iterator itr = movieDetails.iterator();
							boolean found = false;
							while(itr.hasNext())
							{
								MovieDetails object = (MovieDetails) itr.next();
								if(object.getCast().getHero().equalsIgnoreCase(heroName))
								{
									System.out.println(object);
									found = true;
								}
							}
							if(found)
								System.out.println("Movie with given languages are not there");
							break;
			case 'b': System.out.println("Enter heroine name");
			  			 	String heroineName = utility.sentenceValidation(sc);
			  			 	Iterator itr1 = movieDetails.iterator();
			  			 	boolean found1 = false;
			  			 	while(itr1.hasNext())
			  			 	{
			  			 		MovieDetails object = (MovieDetails) itr1.next();
			  			 		if(object.getCast().getHeroine().equalsIgnoreCase(heroineName))
			  			 		{
			  			 			System.out.println(object);
			  			 			found1 = true;
			  			 		}
			  			 	}
			  			 	if(found1)
			  			 		System.out.println("Movie with given languages are not there");
			  			 	break;
			case 'c': System.out.println("Enter Director name");
			  				String directorName = utility.sentenceValidation(sc);
			  				Iterator itr3 = movieDetails.iterator();
			  				boolean found3 = false;
			  				while(itr3.hasNext())
			  				{
			  					MovieDetails object = (MovieDetails) itr3.next();
			  					if(object.getCast().getDirector().equalsIgnoreCase(directorName))
			  					{
			  						System.out.println(object);
			  						found3 = true;
			  					}
			  				}	
			  				if(found3)
			  					System.out.println("Movie with given languages are not there");
			  				break;
			case 'd': System.out.println("Enter music Director  name");
			  				String musicDirectorName = utility.sentenceValidation(sc);
			  				Iterator itr4 = movieDetails.iterator();
			  				boolean found4 = false;
			  				while(itr4.hasNext())
			  				{
			  					MovieDetails object = (MovieDetails) itr4.next();
			  					if(object.getCast().getMusicDirector().equals(musicDirectorName))
			  					{
			  						System.out.println(object);
			  						found4 = true;
			  					}
			  				}
			  				if(found4)
			  					System.out.println("Movie with given languages are not there");
			  				break;
			case 'e': exit = true;
							break;
							
			
			}
			
		}while(!exit);
		
	}

	public  void displayMenu() {
		System.out.println("A.Add Movie Details: ");
		System.out.println("B.Display Movie: ");
		System.out.println("C.Delete Movie: ");
		System.out.println("D.Exit");
		}

}
