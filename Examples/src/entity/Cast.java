package entity;

public class Cast {
	private String hero;
	private String heroine;
	private String director;
	private String musicDirector;
	public Cast() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cast(String hero, String heroine, String director, String musicDirector) {
		super();
		this.hero = hero;
		this.heroine = heroine;
		this.director = director;
		this.musicDirector = musicDirector;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroine() {
		return heroine;
	}
	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getMusicDirector() {
		return musicDirector;
	}
	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}
	@Override
	public String toString() {
		return "Cast [hero=" + hero + ", heroine=" + heroine + ", director=" + director + ", musicDirector="
				+ musicDirector + "]";
	}
	
	

}
