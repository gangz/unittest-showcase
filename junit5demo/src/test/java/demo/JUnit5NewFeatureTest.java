package demo;
/**
 * Encoding = UTF-8
 * The case shows that the @DisplayName, @RepeatedTest @Disabled capability of JUnit 5
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

@DisplayName("Display/Repeat/Disable演示")
class JUnit5NewFeatureTest {
	@Test
	@DisplayName("Java5的Display很方便")
	void displayTest() {
		assertEquals(2,1+1);
	}

	@RepeatedTest(3)
	@DisplayName("这个case将会重复3次")
	void repeatedTest() {
		System.out.println("repeatedTest");
	}
	
	@Disabled("这个case暂时因为某种原因不运行")
	void disabledTest() {
		fail("Disable了，不会真的运行");
	}
	
}
