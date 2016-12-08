package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import models.RatingReader;

public class RatingReaderTest {

	@Test
	public void testmovie() throws IOException
	{
		assertEquals(0, RatingReader.ratings.size());
		RatingReader.ratingReader();
		assert(RatingReader.ratings.size() > 0);
	}
}

