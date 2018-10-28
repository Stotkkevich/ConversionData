package info.sjd;

import java.util.logging.Logger;

public class Palindrom {

	private static Logger logger = Logger.getLogger(Palindrom.class.getName());

	public static void main(String[] args) {
		
		int result = getConversionData();
		logger.info("Max palindrome is " + result);
	}

	public static int getConversionData() {
		for (int a = 9999; a > 999; a--) {
			for (int b = 9999; b > 999; b--) {
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
		for (int � = 0; � < length / 2; �++) {
			if (str.charAt(�) != str.charAt(length - 1 - �))
				return false;
		}
		return true;
	}
}