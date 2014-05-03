import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BusinessTasks {

	public String getTask(String[] list, int n) {
		List<String> myList = new ArrayList<String>(Arrays.asList(list));
		int index = 0;
		while (myList.size() > 1) {
			myList.remove(index = (index + n - 1) % myList.size());
		}
		return myList.get(0);
	}

}
