package stackOfStrings;

import java.util.ArrayList;

class StackOfStrings {
	private ArrayList<String> data;
	
	public StackOfStrings() {
		this.setData(new ArrayList<>());
	}
	
	private void setData(ArrayList<String> data) {
		this.data = data;
	}
	
	public void push(String item) {
		this.data.add(item);
	}
	
	public String pop() {
		String temp = data.get(0);
		this.data.remove(0);
		return temp;
	}
	
	public String peek() {
		return this.data.get(0);
	}
	
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
}
