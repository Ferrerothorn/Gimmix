package sumOfSquares;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit {

	SquareHacker s;

	@Before
	public void setup() {
		s = new SquareHacker();
	}

	@After
	public void teardown() {
		s.clearArray();
	}
	
	@Test
	public void test1() {
		assertEquals("[1]", s.breakdown(1));
	}
	
	@Test
	public void test2() {
		assertEquals("[1, 1]", s.breakdown(2));
	}	
	
	@Test
	public void test14() {
		assertEquals("[3, 2, 1]", s.breakdown(14));
	}
	
	@Test
	public void test16() {
		assertEquals("[4]", s.breakdown(16));
	}
	
	@Test
	public void test17() {
		assertEquals("[4, 1]", s.breakdown(17));
	}
	
	@Test
	public void test20() {
		assertEquals("[4, 2]", s.breakdown(20));
	}
	
	@Test
	public void test29() {
		assertEquals("[5, 2]", s.breakdown(29));
	}
	
	@Test
	public void test415() {
		assertEquals("[20, 3, 2, 1, 1]", s.breakdown(415));
	}
	
	@Test
	public void test2112() {
		assertEquals("[45, 9, 2, 1, 1]", s.breakdown(2112));
	}


}
