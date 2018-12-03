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
		fail("这个测试将会失败");
	}

	@Test
	public void 也可以使用中文作为测试名() {
		fail("这个测试将会失败");
	}
	
	@Ignore
	public void an_ignored_testcase() {
		fail("这个测试不会失败，而是会被忽略.");
	}
	
	@Before
	public void setUp() {
		System.out.println("[仅仅演示目的]测试开始. ");
	}
	
	@After
	public void tearDown() {
		System.out.println("[仅仅演示目的]测试结束 ");		
	}
}
