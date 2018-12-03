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
		fail("Not yet implemented");
	}
	
	@Ignore
	public void an_ignored_testcase() {
		fail("This case will be ignored.");
	}
	
	@Before
	public void setUp() {
		System.out.println("[demo purpose only] test case started. ");
	}
	
	@After
	public void tearDown() {
		System.out.println("[demo purpose only] test case done. ");		
	}
}
