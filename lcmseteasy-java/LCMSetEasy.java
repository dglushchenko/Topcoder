
public class LCMSetEasy {

	private long gcd(long a, long b) {
		return b > 0 ? gcd(b, a % b) : a;
	}

	private long lcm(long a, long b) {
		return a * (b / gcd(a, b));
	}

	public String include(int[] S, int x) {
		final String y = "Possible";
		final String n = "Impossible";
		long lcm = 1;
		for (int i = 0; i < S.length; i++) {
			if (x % S[i] == 0) {
				lcm = lcm(lcm, S[i]);
			}
		}
		return lcm == x ? y : n;
	}

}
