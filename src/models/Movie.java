package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movie {
	private long movieId;
	private String title;
	//private int releaseDate;
	private String releaseDate;
	private String url;
	private int rating;
	private List<String> movies;
	
	
	
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

public List<String> getMoviesList(String subString) {
	List<String> MoviesList = new ArrayList<String>();
	if (subString != null) {
		for (String m : MoviesList) {

			if (m.toLowerCase().contains(subString.toLowerCase()))//not case sensitive
				MoviesList.add(m);
		}
	}
	Collections.sort(MoviesList);//sorts the list
	return MoviesList;
}
	

}
