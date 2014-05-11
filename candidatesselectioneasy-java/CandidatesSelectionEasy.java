public class CandidatesSelectionEasy {

	public int[] sort(String[] score, int x) {
		int[] result = new int[score.length];
		int index = 0;

		for (int i = 65; i < 65 + 26; i++) {
			for (int j = 0; j < result.length; j++) {
				if (score[j].charAt(x) == i) {
					result[index++] = j;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(((int) 'A'));
	}

}
