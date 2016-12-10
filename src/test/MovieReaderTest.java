package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import models.MovieReader;

public class MovieReaderTest {
		

		@Before
		public void setUp() throws IOException {
			
		}
		

		
		@Test
		public void testmovie() throws IOException
		{
			assertEquals(0, MovieReader.movies.size());
			MovieReader.movieReader();
			assert(MovieReader.movies.size() > 0);//tests reading in the data
			
		}
		
		@Test
		public void testGetTitles()
		{
			//assertEquals("Toy Story (1995)", MovieReader.movies.get(0).getTitle());
			//assertNotNull(MovieReader.movies.get(new Long(1)));
			
		}
		
		@After
		public void tearDown()
		{
		}
	}


