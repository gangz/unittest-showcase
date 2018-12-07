package demo;

/**
 * The example shows the dependency test using the java 8 lamba expression
 * for lazy evaluation.
 */
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class Person{

	public String getFirstName() {
		return "Jxn";
	}

	public String getLastName() {
		return "Dxe";
	}
	
}
public class DependentAssertionsTest {

    private Person person = new Person();

	@Test
    void dependentAssertions() {
        assertAll("properties",
            () -> {
                String firstName = person.getFirstName();
                assertNotNull(firstName);

                // Executed only if the previous assertion is valid.
                assertAll("first name",
                    () -> assertTrue(firstName.startsWith("J")),
                    () -> assertTrue(firstName.endsWith("n"))
                );
            },
            () -> {
                String lastName = person.getLastName();
                assertNotNull(lastName);

                // Executed only if the previous assertion is valid.
                assertAll("last name",
                    () -> assertTrue(lastName.startsWith("D")),
                    () -> assertTrue(lastName.endsWith("e"))
                );
            }
        );
    }}

