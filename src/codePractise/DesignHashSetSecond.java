package codePractise;
//https://www.youtube.com/watch?v=NrMaQL_4Npo
import java.util.ArrayList;
import java.util.List;

public class DesignHashSetSecond {
	private final int MAX_VALUE=100000;
	private final int ARRAY_SIZE=100;
	private List<List<Integer>> parentList;
	
	public DesignHashSetSecond() {
		parentList = new ArrayList<>(ARRAY_SIZE);
		for(int i=0;i<ARRAY_SIZE;i++) {
			parentList.add(null);
		}
	}
	
	public void add(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList==null) {
			childList = new ArrayList<>();
			childList.add(key);
			parentList.set(index,childList);
			
		}else {
			if(!childList.contains(key)) {
				childList.add(key);
			}
			
			//parentList.set(index,childList);
		}
	}

	public void remove(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList!=null) {
			childList.remove(Integer.valueOf(key));
		}
		
	}

	public boolean contains(int key) {
		int index = key % ARRAY_SIZE;
		List<Integer> childList = parentList.get(index);
		if(childList!=null) {
			if(childList.contains(Integer.valueOf(key))) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
