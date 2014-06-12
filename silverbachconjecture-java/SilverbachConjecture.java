public class SilverbachConjecture {

	private boolean isComposite(int n) {
		boolean composite = false;
		if (n % 2 == 0) {
			composite = true;
		} else {
			for (int i = 3; i < n; i++) {
				if (n % i == 0) {
					composite = true;
				}
			}
		}
		return composite;
	}

	public int[] solve(int n) {
		for (int i = 4; i < n; i++) {
			if (isComposite(i) && isComposite(n - i)) {
				return new int[] {i, n - i};
			}
		}

		return new int[] { -1, -1 };
	}

}
