public class FizzBuzzTurbo {

	public long[] counts(long A, long B) {
		long[] result = new long[3];

		result[2] = B / 15 - (A - 1) / 15;
		result[0] = B / 3 - (A - 1) / 3 - result[2];
		result[1] = B / 5 - (A - 1) / 5 - result[2];

		return result;
	}

}
