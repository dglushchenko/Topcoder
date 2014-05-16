public class LeftAndRightHandedDiv2 {

	public int count(String S) {
		int count = 0;
		for (int i = 0; i < S.length() - 1; i++) {
			if (S.charAt(i) == 'R' && S.charAt(i + 1) == 'L') {
				count++;
			}
		}
		return count;
	}

}
