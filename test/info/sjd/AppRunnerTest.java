package info.sjd;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppRunnerTest {

	@Test
	public void testGetFirstMethod() {
		int d = AppRunner.getFirstMethod();

		assertNotNull(d);
		assertEquals(15, (int) d);
	}

	@Test
	public void testGetSecondMethod() {
		int j = AppRunner.getSecondMethod();

		assertNotNull(j);
		assertFalse(AppRunner.getSecondMethod() >= 16);
	}
	
	@Test
	public void testGetConversionData() {
		int s = AppRunner.getConversionData();

		assertNotNull(s);
		assertEquals(99000099, (int) s);
	}

	@Test
	public void testIsMaxPalindrome() {
		boolean condition = AppRunner.isMaxPalindrome(12345);

		assertNotNull(condition);
		assertTrue(!condition);
	}

	

}
