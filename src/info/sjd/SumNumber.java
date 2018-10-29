package info.sjd;

import java.util.logging.Logger;

public class SumNumber {

	private static Logger logger = Logger.getLogger(SumNumber.class.getName());
	private static String a = "12345";

	public static void main(String[] args) {

		int d = getFirstMethod();
		logger.info("First method: Dividing number " + a + " on symbols, we get " + d);
		int j = getSecondMethod();
		logger.info("Second method: Dividing number " + a + " on symbols, we get " + j);
	}

	public static int getFirstMethod() {

		int x = 12345;
		int s = 0;

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

}