package models;

public class Rating {

	private long userId;
	private long movieId;
	private int rating;

	public Rating(long userId, long movieId, int rating){

		this.userId = userId;
		this.movieId = movieId;
		this.rating = rating;
	}

	@Override
	public String toString()
	{
		return "User Id" + userId + "Movie Id"+ movieId +"Rating" + rating;
	}

	public long getUserId() {
		return userId;
	}

	public long getMovieId() {
		return movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


}
