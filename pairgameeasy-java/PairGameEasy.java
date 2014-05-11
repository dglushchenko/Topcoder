public class PairGameEasy {

	// Incorrect solution submitted during the round
	/*public String able(int a, int b, int c, int d) {
		boolean cFound = false;
		boolean dFound = false;
		for (int i = 1; i <= 10000; i++) {
			for (int j = 0; j <= 10000; j++) {
				if (!cFound && (a * i + b * j == c)) {
					cFound = true;
				}
				if (cFound) {
					break;
				}
			}
			if (cFound) {
				break;
			}
		}
		for (int i = 1; i <= 10000; i++) {
			for (int j = 0; j <= 10000; j++) {
				if (!dFound && (b * i + a * j == d)) {
					dFound = true;
				}
				if (dFound) {
					break;
				}
			}
			if (dFound) {
				break;
			}
		}
		if (cFound && dFound) {
			return "Able to generate";
		} else {
			return "Not able to generate";
		}
	}*/

	private boolean possible(int a, int b, int c, int d) {
		if (a == c && b == d) {
			return true;
		}
		if (a > c || b > d) {
			return false;
		}
		return possible(a + b, b, c, d) || possible(a, b + a, c, d);
	}
	
	public String able(int a, int b, int c, int d) {
		if (possible(a, b, c, d)) {
			return "Able to generate";
		} else {
			return "Not able to generate";
		}
	}
}
