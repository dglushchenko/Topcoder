import java.util.LinkedList;
import java.util.Queue;


public class EmoticonsDiv2 {

	private static class State {
		private int value;
		private int clipboard;
		private int step;
		public State(int value, int clipboard, int step) {
			this.value = value;
			this.clipboard = clipboard;
			this.step = step;
		}
		@Override
		public String toString() {
			return "State [v=" + value + ", c=" + clipboard
					+ ", s=" + step + "]";
		}
	}
	
	public int printSmiles(int smiles) {
		Queue<State> queue = new LinkedList<State>();
		queue.add(new State(1, 1, 1));
		int min = Integer.MAX_VALUE;
		while (!queue.isEmpty()) {
			State state = queue.remove();
			if (state.value == smiles) {
				min = Math.min(min, state.step);
			}
			if (state.value < smiles && state.step < min) {
				State multiply = new State(state.value * 2, state.value, state.step + 2);
				queue.add(multiply);
				State add = new State(state.value + state.clipboard, state.clipboard, state.step + 1);
				queue.add(add);
				//System.out.println(state + " -> " + add + "; " + multiply);
			}
		}
		
		return min;
	}

}
