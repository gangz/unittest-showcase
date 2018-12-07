package demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnit5Test {

	@BeforeEach
	public void setUp() {
		System.out.println("[BeforeEach]invoked ");
	}

	@AfterEach
	public void tearDown() {
		System.out.println("[AfterEach]invoked ");
	}

	@BeforeAll
	public static void suiteSetUp() {
		System.out.println("[BeforeAll]invoked ");
	}

	@AfterAll
	public static void suiteTearDown() {
		System.out.println("[AfterAll]invoked ");
	}
	
	@Test
	public void math_add_should_work() {
		assertEquals(3, new Math().add(1, 2), "add 1 and 2 should be 3");
	}
}

