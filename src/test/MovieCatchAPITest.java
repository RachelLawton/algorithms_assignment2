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
			
			User Rachel = new User("Rachel","Lawton",19,"F","Programmer",11111);

		    assertEquals (0, movieCatch.getUsers().size());
		    movieCatch.addUser("Rachel","Lawton",19,"F","Programmer",11111);
		  }  
		
		

		 @Test
		  public void testAddUsers()
		  {
			
			 assertEquals(1,movieCatch.usersIndex.size());
			 movieCatch.addUser("Nicola","Lawton",30,"F","gardener",11111); 
			 assertEquals(2,movieCatch.usersIndex.size());
		
		  }
		
		 
		 @Test
		  public void testUserEmpty()
		  {
			// User Rachel = new User(6,"Rachel","Lawton",19,"F","Programmer",11111);

		    assertEquals (2, movieCatch.getUsers().size());
		    movieCatch.addUser("Rachel","Lawton",19,"F","Programmer",11111);
		    assertEquals (3, movieCatch.getUsers().size());
		  } 
		
		@Test
		public void testMovie(){
			//Movie ToyStory = new Movie(1,"Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
			
			assertEquals (0, movieCatch.getMovies().size());
		    movieCatch.addMovie("Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
		}
		
		 @Test
		  public void testAddMovie()
		  {
			 assertEquals(1,movieCatch.moviesIndex.size());
			 movieCatch.addMovie("Toy Story (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Toy%20Story%20(1995)");//,0|0|0|1|1|1|0|0|0|0|0|0|0|0|0|0|0|0|0);
			 assertEquals(2,movieCatch.moviesIndex.size());	
			 movieCatch.addMovie("Dead Man Walking (1995)","01-Jan-1995","http://us.imdb.com/M/title-exact?Dead%20Man%20Walking%20(1995)");
			
		  }
		 
		 @Test
		 public void testAddRating()
		 {
			 
		 }
		
		
		@After
		public void tearDown()
		{
			movieCatch = null;
		}
}
