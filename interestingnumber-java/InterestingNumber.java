import java.util.Arrays;

public class InterestingNumber {

	public String isInteresting(String x) {
		String y = "Interesting";
		String n = "Not interesting";
		
		int[] fromIndexes = new int[10];
		Arrays.fill(fromIndexes, -1);
		for (int i = 0; i < x.length(); i++) {
			int j = x.charAt(i) - 48;
			if (fromIndexes[j] == -1) {
				fromIndexes[j] = i;
			} else if (fromIndexes[j] == -2) {
				return n;
			} else {
				if (i - fromIndexes[j] != j + 1) {
					return n;
				} else {
					fromIndexes[j] = -2;
				}
			}
		}
		
		return y;
	}
}
