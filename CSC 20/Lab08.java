// Main tester file for your use (DO NOT MODIFY THIS!)

package Main;

public class Lab08{
	public static void main(String[] args){
		// TESTS ONLY! DO NOT MODIFY!
		StackList sl = new StackList();
		p(sl.pop());
		p(sl.peek());
		sl.push("Test string one");
		p(sl.peek());
		p(sl.size());
		p(sl.isEmpty());
		sl.push("Test string two");
		sl.push("Test string three");
		p(sl.pop());
		p(sl.size());
		p(sl.isEmpty());
		sl.clear();
		p(sl.isEmpty());
		// END OF TESTS.
	}
	
	/* Helper method for easy displaying of text to console */
	public static <E> void p(E item){
		System.out.println(item);
	}
}