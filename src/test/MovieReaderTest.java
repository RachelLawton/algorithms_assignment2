package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import models.MovieReader;

public class MovieReaderTest {
		

		@Before
		public void setUp() throws IOException {
			//MovieReader.movieReader();
			
		}
		

		
		@Test
		public void testmovie() throws IOException
		{
			assertEquals(0, MovieReader.movies.size());
			assert(MovieReader.movies.size() > 0);
			
			//assertNotNull(MovieReader.movies.get(new Long(1)));
			
		}
		
		@Test
		public void testGetTitles()
		{
			assertEquals("Toy Story (1995)", MovieReader.movies.get(0).getTitle());
		}
	}


