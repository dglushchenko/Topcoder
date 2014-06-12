import java.util.Arrays;

public class TwoWaysSorting {

	public String sortingMethod(String[] stringList) {
		String[] lexi = new String[stringList.length];
		System.arraycopy(stringList, 0, lexi, 0, stringList.length);

		Arrays.sort(lexi);

		int[] original = new int[stringList.length];
		int[] lengths = new int[stringList.length];
		for (int i = 0; i < lengths.length; i++) {
			original[i] = stringList[i].length();
			lengths[i] = stringList[i].length();
		}

		Arrays.sort(lengths);

		boolean lex = true;
		for (int i = 0; i < lengths.length; i++) {
			if (!stringList[i].equals(lexi[i])) {
				lex = false;
				break;
			}
		}
		boolean len = true;
		for (int i = 0; i < lengths.length; i++) {
			if (lengths[i] != original[i]) {
				len = false;
				break;
			}
		}
		
		if (lex && len) {
			return "both";
		} else if (lex) {
			return "lexicographically";
		} else if (len) {
			return "lengths";
		} else {
			return "none";
		}
	}

}
