package entity;

import java.util.Comparator;
import java.util.List;

public class MovieDetails implements Comparable,Comparator<MovieDetails>{
	private String moveId;
	private String movieName;
	private float rating;
	private String language;
	private String genre;
	private Cast cast;
	public MovieDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieDetails(String moveId, String movieName, float rating, String language, String genre, Cast castDetails) {
		super();
		this.moveId = moveId;
		this.movieName = movieName;
		this.rating = rating;
		this.language = language;
		this.genre = genre;
		this.cast = castDetails;
	}
	public String getMoveId() {
		return moveId;
	}
	public void setMoveId(String moveId) {
		this.moveId = moveId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public Cast getCast() {
		return cast;
	}
	public void setCast(Cast cast) {
		this.cast = cast;
	}
	@Override
	public String toString() {
		return "MovieDetails [moveId=" + moveId + ", movieName=" + movieName + ", rating=" + rating + ", language="
				+ language + ", genre=" + genre + ", cast=" + cast + "]";
	}
	@Override
	public int compareTo(Object o) {
		MovieDetails object = (MovieDetails)o;
		return (this.getMovieName().compareTo(object.getMovieName()));
	}
	@Override
	public int compare(MovieDetails o1, MovieDetails o2) {
		if(o1.getRating()==o2.getRating())
			return 0;
		else if(o1.getRating()>o2.getRating())
			return 1;
		else
		return -1;
	}
	

	

}
