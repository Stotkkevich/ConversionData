package info.sjd;

import static org.junit.Assert.*;
import org.junit.Test;

public class SumNumberTest {

	@Test
	public void testGetConversionData() {
		int d = SumNumber.getConversionData();

		assertNotNull(d);
		assertEquals(15, (int) d);
	}
}
