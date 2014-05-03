
public class LongWordsDiv2 {

	public String find(String word) {
		String likes = "Likes";
		String dislikes = "Dislikes";

		if (word.toUpperCase() != word) {
			return dislikes;
		}

		char previousC = 0;
		for (char c : word.toCharArray()) {
			if (c == previousC) {
				return dislikes;
			}
			previousC = c;
		}

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					for (int k = i + 1; k < j; k++) {
						for (int l = j + 1; l < word.length(); l++) {
							if (word.charAt(k) == word.charAt(l)) {
								return dislikes;
							}
						}
					}
				}
			}
		}

		return likes;
	}
}
