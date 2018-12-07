package demo;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class JUnitDemo {
	@Test
	public void a_normal_testcase() {
        assertEquals(2, 1 + 1);
	}
	
	@Test
	public void a_failed_testcase() {
		fail("this is a failed case");
	}

	@Ignore
	public void an_ignored_testcase() {
		fail("this case is ignored.");
	}
	
	@Before
	public void setUp() {
		System.out.println("[demo]run before each case. ");
	}
	
	@After
	public void tearDown() {
		System.out.println("[demo]run after each case. ");		
	}
}
