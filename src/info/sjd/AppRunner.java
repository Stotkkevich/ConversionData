package info.sjd;

import java.util.logging.Logger;

public class AppRunner {

	private static Logger logger = Logger.getLogger(AppRunner.class.getName());
	private static String a = "12345";
	private static int z = Integer.parseInt(a);
	private static int m = 9999, n = 9999;
	
	public static void main(String[] args) {
		
		int s = getConversionData();
//		logger.info("Maximum palindrome number when multiplied " + m + " on " + n + " equally " + s);
		logger.info("Максимальное число-палиндром, при умножении " + m + " на " + n + " равно " + s);
		int d = getFirstMethod();
//		logger.info("Sum of digits " + a + " division residue method, is equal to " + d);
		logger.info("Сумма цифр числа " + a + " методом остатка от деления, равна " + d);
		int j = getSecondMethod();
//		logger.info("Sum of digits " + a + " by character breaking, is equal to " + j);
		logger.info("Сумма цифр числа " + a + " методом разделения числа на символы, равна " + j);
	}

	public static int getFirstMethod() {

		int s = 0;

		while (z != 0) {
			s += z % 10;
			z /= 10;
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

	public static boolean isMaxPalindrome(int s) {
		final String str = String.valueOf(s);
		int length = str.length();
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - 1 - i))
				return false;
		}
		return true;
	}
}