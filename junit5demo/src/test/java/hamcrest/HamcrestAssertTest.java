package hamcrest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class HamcrestAssertTest {
	@Test
	public void test() {
		boolean a = true;
		boolean b = true;
		assertThat(a, equalTo(b));
		assertThat(a, is(equalTo(b)));
		assertThat(a, is(b));
	}
}
