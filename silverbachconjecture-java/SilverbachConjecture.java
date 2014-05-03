public class SilverbachConjecture {

	public int[] solve(int n) {
		for (int i = 4; i < n; i++) {
			for (int j = 4; j < i; j++) {
				if (i % j == 0) {
					for (int k = 4; k < n - i; k++) {
						if ((n - i) % k == 0) {
							System.out.println(n + ": " + i + ", " + (n - i) + ", " + k);
							return new int[] {i, n - i};
						}
					}
				}
			}
		}
		
		return new int[] {-1, -1};
	}

}
