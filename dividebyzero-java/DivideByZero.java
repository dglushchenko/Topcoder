import java.util.HashSet;
import java.util.Set;

public class DivideByZero {

	public int CountNumbers(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			set.add(numbers[i]);
		}
		
		boolean found = true;
		while (found) {
			found = false;
			Set<Integer> add = new HashSet<Integer>();
			for (int a : set) {
				for (int b : set) {
					if (a > b) {
						if (!set.contains(a / b)) {
							found = true;
							add.add(a / b);
						}
					}
				}
			}
			set.addAll(add);
		}
		
		return set.size();
	}

}
