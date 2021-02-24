package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import entity.Cast;
import entity.MovieDetails;

public class BookingMovieTickets implements Comparator<MovieDetails>{
	Utility utility = new Utility();
	//BookingMovieTickets bookingMovieTickets = new BookingMovieTickets();

	public void addMovieDetails(Scanner sc, List<MovieDetails> movieDetails) {
		System.out.println("Enter Number of cinemas you want to enter");
		int size = utility.intValidation(sc);
		List<MovieDetails> movies = new ArrayList<MovieDetails>(size);
		//List<Cast> castDetails = new ArrayList<Cast>();
		for(int i = 0;i<size;i++)
		{
			System.out.println("Enter Movie id");
			String movieId = utility.stringValidation(sc);
			System.out.println("Enter movie name");
			String movieName = utility.sentenceValidation(sc);
			System.out.println("Enter rating  of the movie");
			float rating=utility.floatValidation(sc);
			System.out.println("Enter language of the movie");
			String language = utility.stringValidation(sc);
			System.out.println("Enter the genre of the movie");
			String genre = utility.sentenceValidation(sc);
			System.out.println("Enter the casting details");
			Cast cast =  new BookingMovieTickets().addCastDetails(sc);
			MovieDetails movieObject = new MovieDetails(movieId,movieName,rating,language,genre,cast);
			movies.add(movieObject);
		}
		movieDetails.addAll(movies);
	}

	public Cast addCastDetails(Scanner sc) {
		List<Cast>castDetails = new ArrayList<Cast>();
		System.out.println("Enter hero name");
		String heroName = utility.sentenceValidation(sc);
		System.out.println("Enter heroinName");
		String heroineName = utility.sentenceValidation(sc);
		System.out.println("Enter Director name");
		String DirectorName = utility.sentenceValidation(sc);
		System.out.println("Enter Music Director Name");
		String musicDirectorName = utility.sentenceValidation(sc);
		Cast cast = new Cast(heroName,heroineName,DirectorName,musicDirectorName);
		return cast;
	}

	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		
		return (o1.getMoveId().compareTo(o2.getMoveId()));
	}

	public void deleteMovie(Scanner sc, List<MovieDetails> movieDetails) {
		System.out.println("Enter movie name you want to delete");
		String name = utility.sentenceValidation(sc);
		Iterator itr = movieDetails.listIterator();
		while(itr.hasNext())
		{
			MovieDetails movie = (MovieDetails) itr.next();
			if(movie.getMovieName().equals(name))
			{
				itr.remove();
			}
				
		}
	}


}
