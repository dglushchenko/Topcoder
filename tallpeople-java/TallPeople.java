public class TallPeople {

	public int[] getPeople(String[] people) {
		int rowLength = people[0].split(" ").length;
		int[][] p = new int[people.length][rowLength];
		for (int i = 0; i < p.length; i++) {
			String[] split = people[i].split(" ");
			for (int j = 0; j < rowLength; j++) {
				p[i][j] = Integer.valueOf(split[j]);
			}
		}
		int row = Integer.MIN_VALUE;
		for (int i = 0; i < p.length; i++) {
			int shortest = Integer.MAX_VALUE;
			for (int j = 0; j < rowLength; j++) {
				if (p[i][j] < shortest) {
					shortest = p[i][j];
				}
			}
			if (shortest > row) {
				row = shortest;
			}
		}
		int column = Integer.MAX_VALUE;
		for (int j = 0; j < rowLength; j++) {
			int tallest = Integer.MIN_VALUE;
			for (int i = 0; i < p.length; i++) {
				if (p[i][j] > tallest) {
					tallest = p[i][j];
				}
			}
			if (tallest < column) {
				column = tallest;
			}
		}
		
		return new int[] {row, column};
	}

}
