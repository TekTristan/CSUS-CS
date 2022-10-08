// Your name here: Tristan Dinh

package main;

public class Lab01{
	public static void main(String[] args){
		// TESTER: DO NOT MODIFY!!!
		int[] a = {2,5,3,4,9,8,6,7,1,0};
		int[] b = {5,4,6,3,7,2,8,-1,1,9};
		Lab01 lab = new Lab01(a);			// Declare and initialize class object
		p(lab.getSize());					// Should return 10
		p(lab.getElement(0));				// Should return 2
		p(lab.getMax());					// Should return 9
		p(lab.getSum());					// Should return 45
		p(Lab01.getStaticMin(b));			// Should return -1
		// END OF TEST!!!
	}
	// HELPER METHOD FOR TEST: DO NOT MODIFY!!!
	public static <E> void p(E item){
		System.out.println(item);
	}
	
	// Fields below here...\
	private int[] numb;
	
	// Constructor below here...
	public Lab01(int [] numb) {
		this.numb = numb;
	}
		
	// Methods below here...
	public int getSize() {
		int length = numb.length;
		return length;
	}
	
	public int getElement(int index) {
		if (this.numb.length == 0) {
				return -1;
		}
		return this.numb[index];
	}
	
	public int getMax() {
		if (this.numb.length == 0) {
				return -1;
		}
		int max = 0;
		for (int i = 0; i < numb.length; i++) {
				if (numb[i] > max)
					max = numb[i];
	
		}
		return max;
	}
	
	public int getSum() {
		int sum = 0;
		for(int i=0; i < numb.length; i++) {
				sum = sum + numb[i];
				
		}
		
		return sum;
	}
	
	public static int getStaticMin(int [] numb) {
		
		if (numb.length == 0) {
				return -1;
		}
		int min = numb[0];
		for (int i = 0; i < numb.length; i++) {
				if(numb[i] < min) {
					min = numb[i];
				}
		}

		return min;
	}
	
	
	
	
	

		
		
	
	
	                           		
	
}