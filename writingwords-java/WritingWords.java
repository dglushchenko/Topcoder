public class WritingWords {

	public int write(String word) {
		int count = 0;
		for (int c : word.toCharArray()) {
			count += c - 65 + 1;
		}
		return count;
	}
}
