import java.util.HashSet;
import java.util.Set;

public class ColorfulCoinsEasy {

	public String isPossible(int[] values) {
		String y = "Possible";
		String n = "Impossible";
		
		if (values.length == 1) {
			return y;
		}
		
		Set<Integer> relations = new HashSet<Integer>();
		for (int i = 0; i < values.length - 1; i++) {
			int relation = values[i+1] / values[i];
			if (relations.contains(relation)) {
				return n;
			} else {
				relations.add(relation);
			}
		}
		return y;
	}

}
