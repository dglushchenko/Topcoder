import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumbersChallenge {

	public int MinNumber(int[] S) {
		int length = 100000 * 20 + 1;
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		map.put(0, new ArrayList<Integer>());
		int result = -1;
		for (int i = 1; i < length; i++) {
			boolean possible = false;
			for (int s : S) {
				List<Integer> list = map.get(i - s);
				if (list != null) {
					List<Integer> tempList = new ArrayList<Integer>(list);
					int count = 0;
					for (int k : S) {
						if (k == s) {
							count++;
						}
					}
					for (int k : tempList) {
						if (k == s) {
							count--;
						}
						if (count < 0) {
							break;
						}
					}

					if (count > 0 || i - s == 0) {
						List<Integer> newList = new ArrayList<Integer>(list);
						newList.add(s);
						map.put(i, newList);
						possible = true;
						break;
					}
				}
			}
			if (!possible) {
				result = i;
				break;
			}
		}
		return result;
	}

}
