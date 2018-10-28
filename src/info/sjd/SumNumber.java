package info.sjd;

import java.util.logging.Logger;

public class SumNumber {

	private static Logger logger = Logger.getLogger(SumNumber.class.getName());
	private static int a = 12345;

	public static void main(String[] args) {

		int d = getConversionData();
		logger.info("Sum of digits in number " + a + " equals " + d);

	}

	public static int getConversionData() {

		int b = a;
		int c = 0;
		while (b != 0) {
			c += b % 10;
			b /= 10;
		}
		return c;
	}
}