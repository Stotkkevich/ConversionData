package info.sjd;

import static org.junit.Assert.*;

import org.junit.Test;

public class SplitNumberTest {

	@Test
	public void testGetConversionData() {
		String d = SplitNumber.getConversionData();

		assertNotNull(d);
	}
}
