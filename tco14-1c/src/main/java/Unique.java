
public class Unique {

	public String removeDuplicates(String S) {
		String result = "";
		for (char c : S.toCharArray()) {
			if (result.indexOf(c) == -1) {
				result += c;
			}
		}
		return result;
	}
	
}
