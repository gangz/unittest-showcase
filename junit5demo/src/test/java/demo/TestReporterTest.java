package demo;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;

public class TestReporterTest {
	@Test
	void testReporterKeyValue(TestReporter testReporter){
	    testReporter.publishEntry("myKey","myValue");
	}
	@Test
	void testReporterMap(TestReporter testReporter){
	    Map<String, String> myMap = new HashMap();
	    myMap.put("myKey","myValue");
	    testReporter.publishEntry(myMap);
	}
}
