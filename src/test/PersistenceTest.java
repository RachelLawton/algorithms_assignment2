package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import controllers.MovieCatchAPI;
import models.User;
import utils.Serializer;
import utils.XMLSerializer;

public class PersistenceTest {
	
	MovieCatchAPI  movieCatch;

	void deleteFile(String fileName)
	  {
	    File datastore = new File ("test3.xml");
	    if (datastore.exists())
	    {
	      datastore.delete();
	    }
	  }
	
	void populate (MovieCatchAPI movieCatch)
	  {
		 assertEquals(0,movieCatch.usersIndex.size());
		 movieCatch.addUser("Nicola","Lawton",30,"F","gardener",11111); 
		 assertEquals(0,movieCatch.usersIndex.size());
		 movieCatch.addUser("Rachel","Lawton",19,"F","Programmer",11111);
	  }
	
	
	 @Test
	  public void testPopulate()
	  { 
		 movieCatch = new MovieCatchAPI(null);
	    assertEquals(3,movieCatch.usersIndex.size());
	    //assertEquals(3,movieCatch.usersIndex.size());
	   
	  }
	
	  @Test
	  public void testXMLSerializer() throws Exception{
	   
	    String datastoreFile = "test3.xml";
	    deleteFile (datastoreFile);
	    
	    Serializer serializer = new XMLSerializer(new File (datastoreFile));
	    
	    movieCatch = new MovieCatchAPI(serializer); 
	    movieCatch.store();
	    
	    MovieCatchAPI movieCatch =  new MovieCatchAPI(serializer);
	    movieCatch.load();
	    
	    assertEquals(movieCatch.getUsers().size(), movieCatch.getUsers().size());
	    deleteFile ("test3.xml");
	  }
}
	  


	  

	  
	  
	  
	 

