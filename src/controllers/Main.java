package controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import models.Movie;
import models.User;
import utils.FileLogger;
import utils.Serializer;
import utils.XMLSerializer;
import asg.cliche.*;
import java.io.IOException;
import asg.cliche.ShellFactory;



	public class Main{
		
	
	
	
	/*public static void main(String[] args) throws IOException 
	{
		Main app = new Main();
	}
	
	public Main() throws IOException
	{
		input = new Scanner(System.in);
		movies = new HashMap<Long,Movie>();
		runMenu();
	}
	
	private int mainMenu() 
	{
	
	//creates main menu
	    System.out.println("---------");   
	    System.out.println("  1) Add Movie");   
	    System.out.println("---------");   
	    System.out.println("---------"); 
	    System.out.println("  2) Remove Movie");  
	    System.out.println("---------");   
	    System.out.println("---------"); 
	    System.out.println("  3) Add User");  
	    System.out.println("---------");   
	    System.out.println("---------"); 
	    System.out.println("  4) Remove User");  
	    System.out.print("==>> ");
	       int option = input.nextInt();
	       return option;
		
	}
	
	private void runMenu() throws IOException
	 {
		 int option = 0;
	       do //prevents it from duplicating itself many times
	       {
	    	    option = mainMenu();
	    	    
	    	   switch (option)
	           {
	              case 1:    	//System.out.println("What Employee do you want to add?");
	            	  			AddMovie();//
	            	  		    break;           
	             default:    System.out.println("Invalid number Inserted: " + option);
	                         break;
	           }
	       }while
	       (option != 0);
	   }
	
private void AddMovie() throws IOException {
		
		
		if (addMovie != true);
		{
			movieCatch = new MovieCatchAPI();
		}
		System.out.println("Please insert Movie Id");
		Long movieId = input.nextLong();
		movieId = input.nextLong();
		Movie m = new Movie (movieId,title,releaseDate,url);
		movies.put(movieId, m);
		
		System.out.println("Please insert Movie Title");
		String title = input.nextLine();
		title = input.nextLine();
		
		System.out.println("Please insert Movie Release Date");
		String releaseDate = input.nextLine();
		releaseDate = input.nextLine();
		
		
		
	}
	public class Main
	{
	 public MovieCatchAPI movieCatch;
	 @Command(description="Add a new User")
	 public void addUser (@Param(name="User Id") long userId,@Param(name="first name") String firstName, @Param(name="last name") String lastName,
	 @Param(name="age") int age, @Param(name="gender") String gender, @Param(name="occupation") String occupation,@Param(name="Zipcode") long zipcode)
	 {
	 movieCatch.addUser(userId,firstName, lastName, age, gender, occupation,zipcode);
	 }
	
	 
	 public static void main(String[] args) throws Exception
	 {
	 Main main = new Main();
	 Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to likemovie - ?help for instructions", main);
	 shell.commandLoop();
	 main.movieCatch.store();
	
public static void main(String[] args) throws IOException
{
  FileLogger logger = FileLogger.getLogger();
  logger.log("Creating user list");

HashMap<Long,User> users= new HashMap<Long,User>();
  users.put(new User(1,"Leonard","Hernandez",24,"M","technician",85711));
  System.out.println(users);

  logger.log("Serializing contacts to XML");
  XStream xstream = new XStream(new DomDriver());
  ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("users.xml"));
  out.writeObject(users);
  out.close();    

  logger.log("Finished - shutting down");
}*/

	
	
	
	
	
	
/*public class Main
{
  public MovieCatchAPI movieCatch;

  public Main() throws Exception
  {
    File datastore = new File("datastore.xml");
    Serializer serializer = new XMLSerializer(datastore);

    movieCatch = new MovieCatchAPI(serializer);
    if (datastore.isFile())
    {
      movieCatch.load();
    }
  }
  */























	/* private static final Long movieId = null;
	@Command(description="Add a Movie")
	 public void addMovie (@Param(name="Movie id") long movieId,@Param(name="Title") String title, @Param(name="Release Date") String releaseDate, @Param(name="Url") String url)
	 {
	 MovieCatchAPI.addMovie(movieId,title, releaseDate, url);
	 }
	 public static void main(String[] args) throws Exception
	 {
	 MovieCatchAPI movieCatch = new MovieCatchAPI();
	 Shell shell = ShellFactory.createConsoleShell("lm", "Welcome to likemovie - ?help for instructions", movieCatch);
	 shell.commandLoop();
	 Movie m = null;
	movieCatch.moviesIndex.put(movieId, m);*/
		
	 }



	
