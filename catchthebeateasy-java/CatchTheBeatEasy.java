import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatchTheBeatEasy {

	public String ableToCatchAll(int[] x, int[] y) {
		String yes = "Able to catch";
		String no = "Not able to catch";
		
		Map<Integer, List<Integer>> points = new HashMap<Integer, List<Integer>>();
		for (int i = 0; i < x.length; i++) {
			List<Integer> list = points.get(y[i]);
			if (list == null) {
				list = new ArrayList<Integer>();
			}
			list.add(x[i] + 1000);
			points.put(y[i], list);
		}
		List<Integer> yPositions = new ArrayList<Integer>(points.keySet());
		Collections.sort(yPositions);
		int previousXPosition = 1000;
		int previousYPosition = 0;
		for (int yPosition : yPositions) {
			List<Integer> xPositions = points.get(yPosition);
			if (xPositions.size() > 1) {
				int firstXPosition = xPositions.get(0);
				for (int currentXPosition : xPositions) {
					if (currentXPosition != firstXPosition) {
						return no;
					}
				}
			}
			int xPosition = xPositions.get(0);
			if (yPosition - previousYPosition < Math.abs(xPosition - previousXPosition)) {
				return no;
			}
			previousXPosition = xPosition;
			previousYPosition = yPosition;
		}
		
		return yes;
	}

}
