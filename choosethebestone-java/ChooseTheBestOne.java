import java.util.ArrayList;
import java.util.List;


public class ChooseTheBestOne {

	public int countNumber(int N) {
		List<Integer> left = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			left.add(i);
		}
		long base = 1;
		long index = 0;
		while (left.size() > 1) {
			index = (index + base * base * base - 1) % N--;
			left.remove((int) index);
			base++;
		}
		return left.get(0);
	}

}
