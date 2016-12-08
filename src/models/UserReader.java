package models;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class UserReader {

	public static HashMap<Long,User> users= new HashMap<Long,User>();
		

	public static void userReader() throws IOException
	{
		
	File usersFile = new File("users5.dat");
    Scanner inUsers = new Scanner(usersFile);
      //each field is separated(delimited) by a '|'
    String delims = "[|]";
    while (inUsers.hasNextLine()) {
		String userDetails = inUsers.nextLine().trim();
		String[] userTokens = userDetails.split(delims);
		
		Long userId = Long.parseLong(userTokens[0]);
		String firstName = userTokens[1];
		String lastName = userTokens[2];
		int age = Integer.parseInt(userTokens[3]);
		String gender = userTokens[4];
		String job = userTokens[5];
		long zipcode =Long.parseLong(userTokens[6]);
		
		

		// output user data to console.
		if (userTokens.length == 2) {
			User u = new User(userId,firstName,lastName,age,gender,job,zipcode);
			users.put(userId, u);

		} else {
			inUsers.close();
			throw new IOException("Invalid length: " + userTokens.length);
		}
	}
	inUsers.close();
    }
	
}
