package controllers;

import asg.cliche.*;
import asg.cliche.ShellFactory;



public class Main
{
	public MovieCatchAPI movieCatch;

	/*public Main() throws Exception
	{
		File datastore = new File("datastore.xml");
		Serializer serializer = new XMLSerializer(datastore);

		movieCatch = new MovieCatchAPI(serializer);
		if (datastore.isFile())
		{
			movieCatch.load();
		}
	}*/
//Creates a new user using cliche
	@Command(description="Create a new User")
	public void addUser(@Param(name="first name") String firstName, @Param(name="last name") String lastName,
			@Param(name="age") int age, @Param(name="gender") String gender, @Param(name="occupation") String occupation,@Param(name="Zipcode") long zipcode)
	{
		movieCatch.addUser(firstName, lastName, age, gender, occupation,zipcode);
	}

	//deletes a user using cliche
	@Command(description="Delete a User")
	public void deleteUser (@Param(name="Id")long userId)
	{
		movieCatch.removeUser(userId);
	}

	//adds a new moving using cliche
	@Command(description="Add a Movie")
	 public void addMovie (@Param(name="title") String title, @Param(name="year") String year, @Param(name="url") String url)
	 {
		movieCatch.addMovie(title, year, url);
	 }
	//deletes a movie using cliche
	@Command(description="Delete a Movie")
	public void deleteMovie (@Param(name="Id")long movieId)
	{
		movieCatch.removeUser(movieId);
	}
	
	//adds a rating using cliche
	@Command(description="Add a Rating")
	 public void addRating (@Param(name="User Id") long userId, @Param(name="Movie Id") long movieId, @Param(name="Rating") int rating)
	 {
		movieCatch.addRating(userId, movieId, rating);
	 }
	
	
	public static void main(String[] args) throws Exception
	{
		Main main = new Main();
		Shell shell = ShellFactory.createConsoleShell("Type", "Welcome to movieCatch - ?help for instructions", main);
		shell.commandLoop();
		main.movieCatch.store();
	}
	
	
	
	

}
	
	