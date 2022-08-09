package codePractise;

//https://leetcode.com/problems/design-hashset/
public class DesignHashSet {
	boolean[] arr;

	public DesignHashSet() {
		arr=new boolean[1000001];
	}

	public void add(int key) {
		arr[key]=true;
	}

	public void remove(int key) {
		arr[key]=false;
	}

	public boolean contains(int key) {
		return arr[key];
	}

}
