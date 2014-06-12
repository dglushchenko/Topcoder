// TODO Not finished, works only for small.
// Idea for large - binary search
public class LongLongTripDiv2 {

	public String isAble(long D, int T, int B) {
		String y = "Possible";
		String n = "Impossible";
		
		int bCount = T;
		int leftBCount = 0;
		int rightBCount = T;
		int step = 0;
		while (step++ < 50) {
			long value = (long) B * bCount + (T - bCount);
			if (D == value) {
				return y;
			}
			if (value > D) {
				rightBCount = bCount;
				bCount = (bCount + leftBCount) / 2;
			}
			if (value < D) {
				leftBCount = bCount;
				bCount = (bCount + rightBCount) / 2;
			}
		}
		
		
		return n;
	}
}
