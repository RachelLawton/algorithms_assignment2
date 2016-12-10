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
		
		/*public static User[] users =
			  {
				new User("Rachel","Lawton",19,"F","Programmer",11111), 
				new User("Nicola","Lawton",30,"F","gardener",11111)  
			  };
		 
		 public static Movie[] movies = {
				 new Movie(1,"Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)") //,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0)	 
		 };*/
		
		@Before
		public void setup()
		{
			movieCatch = new MovieCatchAPI();
		}

		@Test
		  public void testUser()
		  {
			//tests to see if the user is in the map
			
			User Rachel = new User("Rachel","Lawton",19,"F","Programmer",11111);

		    assertEquals (0, movieCatch.getUsers().size());
		    movieCatch.addUser("Rachel","Lawton",19,"F","Programmer",11111);
		  }  
		
		

		 @Test
		  public void testAddUsers()
		  {
			//tests the add user method
			 assertEquals(1,movieCatch.usersIndex.size());
			 movieCatch.addUser("Nicola","Lawton",30,"F","gardener",11111); 
			 assertEquals(2,movieCatch.usersIndex.size());
		
		  }
		
		 
		 @Test
		  public void testUserEmpty()//tests the delete method
		  {
			// User Rachel = new User(6,"Rachel","Lawton",19,"F","Programmer",11111);

		    assertEquals (2, movieCatch.getUsers().size());
		    movieCatch.deleteMovies();
		  }
		   
		
		@Test
		public void testMovie(){//tests to see if the movie is there
			//Movie ToyStory = new Movie(1,"Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
			
			assertEquals (0, movieCatch.getMovies().size());
		    movieCatch.addMovie("Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
		}
		
		 @Test
		  public void testAddMovie()// tests adds movie method
		  {
			 assertEquals(1,movieCatch.moviesIndex.size());
			 movieCatch.addMovie("Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
			 assertEquals(2,movieCatch.moviesIndex.size());	
			 movieCatch.addMovie("Dead Man Walking (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Dead%20Man%20Walking%20(1995)");
			
		  }
		 
		 
		 /*@Test
			public void testAddRating(){
			 movieCatch.addUser("Rachel","Lawton",19,"F","Programmer",11111);
			 movieCatch.addMovie("Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");
			 movieCatch.addRating(1, 1, 1);
			}*/
		
		
		@After
		public void tearDown()
		{
			movieCatch = null;
		}
}
