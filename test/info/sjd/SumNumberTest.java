package info.sjd;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumNumberTest {

	@Test
	public void testGetFirstMethod() {
		int d = SumNumber.getFirstMethod();

		assertNotNull(d);
		assertEquals(15, (int) d);
	}

	@Test
	public void testGetSecondMethod() {
		int j = SumNumber.getSecondMethod();

		assertNotNull(j);
		assertEquals(15, (int) j);
	}
}
