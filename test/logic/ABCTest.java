package logic;

import static org.junit.Assert.*;

import org.junit.Test;

public class ABCTest {

	@Test
	public void initialState() {
		ABC abc = new ABC();
		assertEquals(0, abc.getX());
		assertEquals(0, abc.getY());
	}
	

}
