package models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OccupationsReader{
	

	public static ArrayList<Occupation> occupations= new ArrayList<Occupation>();


	public static void occupationsReader() throws IOException
	{

		File usersFile = new File("occupation.dat");
		Scanner inUsers = new Scanner(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (inUsers.hasNextLine()) {
			String userDetails = inUsers.nextLine();
			String[] userTokens = userDetails.split(delims);
			
			String occupation = userTokens[0];
			




			// output user data to console.
			if (userTokens.length == 1) {
				Occupation o = new Occupation(occupation);//instead of going to console it foes to the arraylist term
				occupations.add(o);
				
			} else {
				inUsers.close();
				throw new IOException("Invalid length: " + userTokens.length);
			}
		}
		inUsers.close();

	}
	}


