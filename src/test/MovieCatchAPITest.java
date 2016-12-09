package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import controllers.MovieCatchAPI;
import models.User;

public class MovieCatchAPITest {

		private MovieCatchAPI movieCatch;
		
		 public static User[] users =
			  {
				new User(6,"Rachel","Lawton",19,"F","Programmer",11111)
			    
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
		
		
		
		@After
		public void tearDown()
		{
			movieCatch = null;
		}
}
