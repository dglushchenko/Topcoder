public class MixingColors {

	public int minColors(int[] colors) {
		if (colors.length == 1) {
			return 1;
		}
		
		int max = 0;
		for (int color : colors) {
			max = Math.max(max, color);
		}

		int index = 0;
		int count = 0;
		int mask = 1;
		while (mask < max) {
			mask = 1 << index++;
			boolean hasOne = false;
			for (int color : colors) {
				if ((color & mask) == mask) {
					hasOne = true;
					break;
				}
			}
			if (hasOne) {
				count++;
			}
		}
		
		return count;
	}

}
