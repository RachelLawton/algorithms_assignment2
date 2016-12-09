package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controllers.MovieCatchAPI;
import models.Movie;
import models.User;

public class MovieCatchAPITest {

		private MovieCatchAPI movieCatch;
		
		 public static User[] users =
			  {
				new User(6,"Rachel","Lawton",19,"F","Programmer",11111)  
			  };
		 
		 public static Movie[] movies = {
				 new Movie(1,"Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)") //,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0)	 
		 };
		
		@Before
		public void setup()
		{
			movieCatch = new MovieCatchAPI();
		}

		@Test
		  public void testUser()
		  {
			User Rachel = new User(6,"Rachel","Lawton",19,"F","Programmer",11111);

		    assertEquals (0, movieCatch.getUsers().size());
		    movieCatch.addUser(6,"Rachel","Lawton",19,"F","Programmer",11111);
		  }  
		
		 @Test
		  public void testAddUsers()
		  {
		    for (User user : users)
		    {
		      movieCatch.addUser(user.userId,user.getFirstName(), user.getLastName(), user.getAge(), user.getGender(), user.getJob(), user.zipcode);
		    }
		    assertEquals (users.length, movieCatch.getUsers().size());
		  }
		
		 
		/* @Test
		  public void testUserEmpty()
		  {
			 User Rachel = new User(6,"Rachel","Lawton",19,"F","Programmer",11111);

		    assertEquals (1, movieCatch.getUsers().size());
		    movieCatch.addUser(6,"Rachel","Lawton",19,"F","Programmer",11111);
		    assertEquals (1, movieCatch.getUsers().size());
		  } */
		
		@Test
		public void testMovie(){
			Movie ToyStory = new Movie(1,"Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
			
			assertEquals (0, movieCatch.getMovies().size());
		    movieCatch.addMovie(1,"Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
		}
		
		 @Test
		  public void testAddMovie()
		  {
		    for (Movie movie : movies)
		    {
		      movieCatch.addMovie(movie.getMovieId(),movie.getTitle(), movie.getReleaseDate(), movie.getUrl());
		    }
		    assertEquals (movies.length, movieCatch.getMovies().size());
		  }
		
		@After
		public void tearDown()
		{
			movieCatch = null;
		}
}
