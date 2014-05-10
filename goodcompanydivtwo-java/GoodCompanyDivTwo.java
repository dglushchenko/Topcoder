import java.util.HashSet;
import java.util.Set;

public class GoodCompanyDivTwo {

	public int countGood(int[] superior, int[] workType) {
		int count = 0;
		
		for (int i = 0; i < superior.length; i++) {
			boolean good = true;
			Set<Integer> workTypes = new HashSet<Integer>();
			workTypes.add(workType[i]);
			for (int j = i; j < workType.length; j++) {
				if (superior[j] != i) {
					continue;
				}
				if (workTypes.contains(workType[j])) {
					good = false;
					break;
				}
				workTypes.add(workType[j]);
			}
			if (good) {
				count++;
			}
		}
		
		return count;
	}

}
