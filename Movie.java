
public class Movie {
	private String movieName;
	private String year;
	private Actor[] actors;

	public Movie() {
		
	}
	
	public Movie(String movieName, String year, Actor[] actors) {

		this.movieName = movieName;
		this.year = year;
		this.actors = actors;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Actor[] getActors() {
		return actors;
	}

	public void setActors(Actor[] actors) {
		this.actors = actors;
	}

	public void printMovie() {
		System.out.println("**********************");
		System.out.println("Movie Name:" + this.movieName);
		System.out.println("Year of Release:" + this.year);
		for (Actor a : actors) {
			a.printActor();
		}
		System.out.println("**********************");

	}

}
