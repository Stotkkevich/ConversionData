package info.sjd;

import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	private static String a = "12345";
	private static int m = 9999, n = 9999;
	
	public static void main(String[] args) {
		
		int result = getConversionData();
		logger.info("Maximum palidrome when multiplying numbers " + m + " on " + n + " equals " + result);
		int d = getFirstMethod();
		logger.info("Sum of digits " + a + " division residue method, is equal to " + d);
		int j = getSecondMethod();
		logger.info("Sum of digits " + a + " by character breaking, is equal to " + j);
	}

	public static int getFirstMethod() {

		int x = 12345, s = 0;

		while (x != 0) {
			s += x % 10;
			x /= 10;
		}
		return s;

	}

	public static int getSecondMethod() {

		String[] b = a.split("");
		int m = 0;
		for (int i = 0; i < b.length; i++) {
			m += Integer.parseInt(b[i]);
		}
		return m;

	}
	
	public static int getConversionData() {
		for (int a = m; a > 999; a--) {
			for (int b = n; b > 999; b--) {
				int result = a * b;
				if (isMaxPalindrome(result))
					return result;
			}
		}
		return -1;
	}

	public static boolean isMaxPalindrome(int result) {
		final String str = String.valueOf(result);
		int length = str.length();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i))
				return false;
		}
		return true;
	}
}