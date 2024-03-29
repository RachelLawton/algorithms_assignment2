package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.User;
import models.UserReader;

public class UserTest {
	
	private User user;
	private User user1;
	private UserReader userReader;
	
	
	@Before
	public void setup()
	{
		user = new User(4,"Oliver","George",24,"M","technician",43537);
		user1 = new User(5,"Jenna","Parker",33,"F","other",15213);
		
	}
	
	private  User[]users =
		{
		// new User (1,"Leonard","Hernandez",24,"M","technician",85711),
		};
	
	User Leonard  = new User("Leonard","Hernandez",24,"M","technician",85711);
	User Leonard2 = new User("Leonard","Hernandez",24,"M","technician",85711);
    User Melody   = new User("Melody", "Roberson",53,"F","other",94043); 
    User Jenna    = new User("Jenna","Parker",33,"F","other",15213);
    User Rachel   = new User("Rachel","Lawton",19,"F","Programmer",11111);
	
	
	@Test
	 public void testEquals()//test to see if there equal
	 {
	   assertEquals(Leonard, Leonard);
	   
	   
	   assertSame(Leonard, Leonard);
	   assertNotSame(Leonard, Melody);
	 }
	
	@Test
	public void testNotEquals()//not equal
	{
		assertNotEquals(Leonard, Melody);
		assertNotEquals(Leonard, Jenna);
		assertNotEquals(Melody, Jenna);
		
	}
	
	@Test 
	public void testGetFirstName()//get first name
	{
		assertEquals("Oliver",user.getFirstName());
		assertNotEquals ("John",user.getFirstName());
		//assertEquals(1,userReader.getFirstName());
	}
	
	@Test 
	public void testGetLastName(){//get last name
		assertNotEquals("Oliver",user.getLastName());
		assertEquals("Parker",user1.getLastName());
		
	}

	@Test
	  public void testCreate()//creates a user
	  {
	    assertEquals ("Rachel",            Rachel.getFirstName());
	    assertEquals ("Lawton",            Rachel.getLastName());
	    assertEquals ( 19,                 Rachel.getAge());   
	    assertEquals ("F",                 Rachel.getGender());   
	    assertEquals ("Programmer",        Rachel.getJob());   
	    assertEquals (11111,               Rachel.getZipcode());   
	  }
	
	
	 @Test
	  public void testIds()//tests ids
	  {
	    Set<Long> Id = new HashSet<>();
	    for (User user : users)
	    {
	      Id.add(user.userId);
	    }
	    assertEquals (users.length, Id.size());
	  }
	
	@After
	public void tearDown()
	{
		user = null;
	}
}
