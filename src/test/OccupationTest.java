package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import models.Occupation;
//import models.MovieReader;
import models.OccupationsReader;

public class OccupationTest {

	@Test
	public void testmovie() throws IOException
	{
		assertEquals(0, OccupationsReader.occupations.size());
		OccupationsReader.occupationsReader();
		assert(OccupationsReader.occupations.size() > 0);
		
	}

}
