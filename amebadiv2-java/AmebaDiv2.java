public class AmebaDiv2 {

	public int simulate(int[] X, int A) {
		int result = A;
		for (int x : X) {
			if (result == x) {
				result += x;
			}
		}
		return result;
	}

}
