package info.sjd;

import java.util.Arrays;
import java.util.logging.Logger;

public class SplitNumber {

	private static Logger logger = Logger.getLogger(SplitNumber.class.getName());
	private static int a = 12345;
	private static String b = String.valueOf(a);

	public static void main(String[] args) {

		String d = getConversionData();
		logger.info("Dividing number " + a + " on symbols, we get " + d);
	}

	public static String getConversionData() {

		final int[] ints = Arrays.stream(b.split("")).mapToInt(c -> Integer.parseInt(c)).toArray();
		return Arrays.toString(ints);
	}
}