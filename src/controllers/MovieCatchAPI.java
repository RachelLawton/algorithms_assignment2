package controllers;

import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.Movie;
import models.User;
import utils.Serializer;

public class MovieCatchAPI 
{
		private Serializer serializer;
	
		public static HashMap<Long,User> usersIndex= new HashMap<Long,User>();
		public static HashMap<Long,Movie> moviesIndex= new HashMap<Long,Movie>();
		
	
	public MovieCatchAPI()
	{
		
	}
	
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

	public Collection<User> getUsers ()
	{
		return usersIndex.values();
	}
	
	public void removeUsers()
	{
		usersIndex.clear();
		
	}
	
	
	public User addUser(long userId, String firstName, String lastName, int age, String gender, String job,long zipcode)
	{
		User u = new User (userId, firstName, lastName, age, gender, job, zipcode );
		usersIndex.put(userId, u);
		return u;
	}
	
	public void removeUser(Long userId)
	{
	  User u = usersIndex.remove(userId);
	}
	

	
	
	//MOVIES
	
	public Collection<Movie> getMovies(){
		return moviesIndex.values();
	}
	
	public void removeMovies()
	{
		moviesIndex.clear();	
	}
	
	public Movie addMovie(long movieId, String title, String releaseDate, String url){
		
		Movie m = new Movie(movieId,title,releaseDate,url);
		moviesIndex.put(movieId, m);
		return m;
	}
	
	public void removeMovie(Long movieId)
	{
	  Movie m = moviesIndex.remove(movieId);
	}
	

}
