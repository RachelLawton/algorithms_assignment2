package models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class RatingReader {
	
	public static ArrayList<Rating> ratings = new ArrayList<Rating>();
	
	public static void ratingReader() throws IOException
	{
		
	File usersFile = new File("ratings5.dat");
    Scanner inUsers = new Scanner(usersFile);
      //each field is separated(delimited) by a '|'
    String delims = "[|]";
    while (inUsers.hasNextLine()) {
		String userDetails = inUsers.nextLine().trim();// cleans up white space at the start
		String[] userTokens = userDetails.split(delims);// splits the weight from the term
		
		long userId = Long.parseLong(userTokens[0]);
		long movieId = Long.parseLong(userTokens[1]);
		int rating = Integer.parseInt(userTokens[2]);
					
		

		// output user data to console.
		if (userTokens.length == 2) {
			Rating r = new Rating(userId,movieId,rating);//instead of going to console it foes to the arraylist term
			ratings.add(r);
			

		} else {
			inUsers.close();
			throw new IOException("Invalid length: " + userTokens.length);
		}
	}
	inUsers.close();

	}
}

