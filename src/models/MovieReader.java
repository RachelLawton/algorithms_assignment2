package models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class MovieReader {

	//public static HashMap<Long,Movie> movies= new HashMap<Long,Movie>();
	//public static List<String> MoviesList;

	public static ArrayList<Movie> movies= new ArrayList<Movie>();


	public static void movieReader() throws IOException
	{

		File usersFile = new File("items5.dat");
		Scanner inUsers = new Scanner(usersFile);
		//each field is separated(delimited) by a '|'
		String delims = "[|]";
		while (inUsers.hasNextLine()) {
			String userDetails = inUsers.nextLine().trim();// cleans up white space at the start
			String[] userTokens = userDetails.split(delims);// splits the weight from the term

			long movieId = Long.parseLong(userTokens[0]);
			String title = userTokens[1];
			//int releaseDate = Integer.parseInt(userTokens[2]);
			String releaseDate = userTokens[2];
			String url = userTokens[3];
			//int rating = Integer.parseInt(userTokens[4]);




			// output user data to console.
			if (userTokens.length == 23) {
				Movie m = new Movie(movieId,title,releaseDate,url);//instead of going to console it foes to the arraylist term
				//movies.put(movieId, m);
				movies.add(m);

				//if (userTokens.length == 23) {
				// System.out.println(movieId+title+releaseDate+url+rating);

			} else {
				inUsers.close();
				throw new IOException("Invalid length: " + userTokens.length);
			}
		}
		inUsers.close();

	}
}
