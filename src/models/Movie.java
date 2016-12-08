package models;

public class Movie {
	private long movieId;
	private String title;
	//private int releaseDate;
	private String releaseDate;
	private String url;
	private int rating;
	
public Movie(long movieId,String title, String releaseDate, String url, int rating){
		super();
		this.movieId = movieId;
		this.title = title;
		this.releaseDate =releaseDate;
		this.url = url;
		this.rating = rating;
	}

public String getTitle() {
	return title;
}

public long getMovieId() {
	return movieId;
}

public String getReleaseDate() {
	return releaseDate;
}

public String getUrl() {
	return url;
}


public int getRating() {
	return rating;
}



public void setRating(int rating) {
	this.rating = rating;
}

public void setMovieId(long movieId) {
	this.movieId = movieId;
}

public void setTitle(String title) {
	this.title = title;
}

public void setReleaseDate(String releaseDate) {
	this.releaseDate = releaseDate;
}

public void setUrl(String url) {
	this.url = url;
}
	

}
