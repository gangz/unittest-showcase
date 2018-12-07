package demo;

/**
 * The JUnit 5 backward compatible for JUnit 4
 */
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnit4StyleTest {
	@Test
	public void a_normal_testcase() {
        assertEquals(2, 1 + 1);
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
