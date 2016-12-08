package controllers;

import java.util.Collection;
import java.util.HashMap;

import models.User;

public class MovieCatchAPI {

	public static HashMap<Long,User> usersIndex= new HashMap<Long,User>();
	
	public MovieCatchAPI()
	{
		
	}
	
	public Collection<User> getUsers ()
	{
		return usersIndex.values();
	}
	
	public void deleteUsers()
	{
		usersIndex.clear();
		
	}
	
	public User addUser(long userId, String firstName, String lastName, int age, String gender, String job,long zipcode)
	{
		User user = new User (userId, firstName, lastName, age, gender, job, zipcode );
		//user.put(userId, user);

		return user;
	}
}
