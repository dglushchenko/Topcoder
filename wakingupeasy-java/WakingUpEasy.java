public class WakingUpEasy {

	public int countAlarms(int[] volume, int S) {
		int count = 0;
		int index = 0;
		while (S > 0) {
			S -= volume[index];
			index++;
			if (index >= volume.length) {
				index = 0;
			}
			count++;
		}
		return count;
	}

}
