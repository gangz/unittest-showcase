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
		fail("������Խ���ʧ��");
	}

	@Test
	public void Ҳ����ʹ��������Ϊ������() {
		fail("������Խ���ʧ��");
	}
	
	@Ignore
	public void an_ignored_testcase() {
		fail("������Բ���ʧ�ܣ����ǻᱻ����.");
	}
	
	@Before
	public void setUp() {
		System.out.println("[������ʾĿ��]���Կ�ʼ. ");
	}
	
	@After
	public void tearDown() {
		System.out.println("[������ʾĿ��]���Խ��� ");		
	}
}
