package test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

//import models.MovieReader;
import models.UserReader;

public class UserReaderTest {

	@Test
	public void testmovie() throws IOException
	{
		assertEquals(0, UserReader.users.size());
		UserReader.userReader();
		assert(UserReader.users.size() > 0);
	}
	}
