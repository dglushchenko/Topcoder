public class SlimeXSlimonadeTycoon {

	public int sell(int[] morning, int[] customers, int stale_limit) {
		int length = morning.length;
		int result = 0;
		for (int i = 0; i < length; i++) {
			for (int j = Math.max(0, i - stale_limit + 1); j <= i; j++) {
				int sell = Math.min(morning[j], customers[i]);
				morning[j] -= sell;
				customers[i] -= sell;
				result += sell;
				if (customers[i] <= 0) {
					break;
				}
			}
		}
		return result;
	}

}
