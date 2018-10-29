package info.sjd;

import java.util.logging.Logger;

public class SumNumber {

	private static Logger logger = Logger.getLogger(SumNumber.class.getName());
	private static String a = "12345";

	public static void main(String[] args) {

		int d = getConversionData();
		logger.info("Dividing number " + a + " on symbols, we get " + d);
	}

	public static int getConversionData() {

		String[] b = a.split("");
		int m = 0;
		for (int i = 0; i < b.length; i++) {
			m += Integer.parseInt(b[i]);
		}
		return m;
	}
}