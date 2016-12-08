package controllers;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import models.User;
import models.UserReader;

public class MovieCatchAPI {


		public static HashMap<Long,User> usersIndex= new HashMap<Long,User>();
		public static HashMap<Long,User> users= new HashMap<Long,User>();
	
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
		User u = new User (userId, firstName, lastName, age, gender, job, zipcode );
		users.put(userId, u);

		return u;
	}
	
	public void deleteUser(Long userId)
	{
	  User user = usersIndex.remove(userId);
	}
}
