/*package test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import controllers.MovieCatchAPI;
import utils.Serializer;
import utils.XMLSerializer;

public class PersistenceTest {

	void deleteFile(String fileName)
	  {
	    File datastore = new File ("testdatastore.xml");
	    if (datastore.exists())
	    {
	      datastore.delete();
	    }
	  }
	
	
	  @Test
	  public void testXMLSerializer() throws Exception
	  { 
	    String datastoreFile = "testdatastore.xml";
	    //deleteFile (datastoreFile);
	    
	    Serializer serializer = new XMLSerializer(new File (datastoreFile));
	    
	    movieCatch = new MovieCatchAPI(serializer); 
	    populate(movieCatch);
	    movieCatch.store();
	    
	    PacemakerAPI pacemaker2 =  new PacemakerAPI(serializer);
	    pacemaker2.load();
	    
	    assertEquals (pacemaker.getUsers().size(), pacemaker2.getUsers().size());
	    for (User user : pacemaker.getUsers())
	    {
	      assertTrue (pacemaker2.getUsers().contains(user));
	    }
	    //deleteFile ("testdatastore.xml");
	  }
	  

}
*/