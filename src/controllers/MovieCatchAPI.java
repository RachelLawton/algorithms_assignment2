package controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import models.Movie;
import models.Rating;
import models.User;
import utils.Serializer;

public class MovieCatchAPI 
{
	private Serializer serializer;

	public static HashMap<Long,User> usersIndex= new HashMap<Long,User>();
	public static HashMap<Long,Movie> moviesIndex= new HashMap<Long,Movie>();
	public static ArrayList<Rating> ratingsIndex = new ArrayList<Rating>();


	public MovieCatchAPI()
	{

	}
	// sets up serializer
	public MovieCatchAPI(Serializer serializer)
	{
		this.serializer = serializer;
	}

	@SuppressWarnings("unchecked")
	public void load() throws Exception
	{
		serializer.read();

		moviesIndex      = (HashMap<Long, Movie>)   serializer.pop();
		usersIndex       = (HashMap<Long, User>)     serializer.pop();
	}

	public void store() throws Exception
	{
		serializer.push(usersIndex);
		serializer.push(moviesIndex);
		serializer.write(); 
	}



	//USERS

	public Collection<User> getUsers () //get all users
	{
		return usersIndex.values();
	}

	public void removeUsers()// removes all users
	{
		usersIndex.clear();

	}

	public User getUserByid(long userId) //gets users by id
	{
		return usersIndex.get(userId);
	}

	public User addUser( String firstName, String lastName, int age, String gender, String job,long zipcode)
	{ //adds user using 
		User u = new User (firstName, lastName, age, gender, job, zipcode);
		u.userId = usersIndex.size() + 1L;
		usersIndex.put(u.userId, u);
		return u;
	}

	public User removeUser(Long userId) //remove user singular
	{
		return  usersIndex.remove(userId);
	}






	//MOVIES

	public Collection<Movie> getMovies()// get all movies
	{
		return moviesIndex.values();
	}

	public void deleteMovies() //delete all movies
	{
		moviesIndex.clear();	
	}

	public Movie addMovie(String title, String releaseDate, String url) //adds movie 
	{

		Movie m = new Movie(title,releaseDate,url);
		m.movieId = moviesIndex.size() + 1L;
		moviesIndex.put(m.movieId, m);
		return m;

	}

	public  Movie deleteMovie(long movieId)// deletes movie singular
	{
		return moviesIndex.remove(movieId);
	}

	public Movie getMovieById(long movieId) // get movie by id
	{
		return moviesIndex.get(movieId);
	}






	//RATINGS
	public void addRating(long userId, long movieId, int rating) //adds a rating 
	{
		Rating r = new Rating(userId,movieId,rating);
		ratingsIndex.add(r.getRating(),r);
	}

	public void deleteRatings() //delets all ratings
	{
		ratingsIndex.clear();
	}

	public Rating  getRating(int rating, long userId) //gets rating
	{
		return ratingsIndex.get(rating);
	}

	public String  movieRecommender()
	{
		return null;

	}

	public Object getTopTenMovies(){

		return null;
	}





}
