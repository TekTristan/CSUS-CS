// Your name here: Tristan Dinh

package Main;

import java.util.ArrayList;

public class StackList{
	// Fields
	private ArrayList<String> a;		// Declared object
	
	// Constructor
	public StackList(){
		// TODO
		 a = new ArrayList<String>();
	}
	
	// Methods
	public void push(String item){
		// TODO
		a.add(item);
	}
	
	public String pop(){
		// TODO
		if (isEmpty()) {
			return "EMPTY";
		}
		else {
			String tek = a.remove(a.size() - 1);
			return tek; 
		}
	}
	
	public String peek(){
		// TODO
		if (isEmpty()) {
			return "EMPTY";
		}
		else {
			String ket = a.get(a.size() - 1);
			return ket;
		}
	}
	
	public boolean isEmpty(){
		// TODO
		if (a.size() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int size(){
		// TODO
		return a.size();
	}
	
	public void clear(){
		// TODO
		a.clear();
	}
}