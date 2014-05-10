// TODO Not finished, works only for small.
// Idea for large - binary search
public class LongLongTripDiv2 {

	public String isAbleSmall(long D, int T, int B) {
		String y = "Possible";
		String n = "Impossible";
		while (T > 0) {
			if (D % B == 0 && D / B == T) {
				return y;
			}
			if (D == T) {
				return y;
			}
			D -= B;
			T--;
		}
		return n;
	}

	public String isAble(long D, int T, int B) {
		return null;
	}
}
