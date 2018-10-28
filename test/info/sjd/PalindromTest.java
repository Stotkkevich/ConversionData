package info.sjd;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromTest {

	@Test
	public void testGetConversion() {
		int result = Palindrom.getConversionData();

		assertNotNull(result);
		assertEquals(99000099, (int) result);
	}

	@Test
	public void testIsMaxPalindrome() {
		boolean condition = Palindrom.isMaxPalindrome(12345);

		assertNotNull(condition);
		assertTrue(!condition);
	}
}
