// Tristan Dinh (NO NAME, NO CREDIT!):

package Main;

public class Lab07{
	public static void main(String[] args){
		// Do NOT modify this method! This portion is provided just so you can see how I will grade the assignment. 
		int[] a = {9,1,8,2,7,3,6,4,5};
		System.out.println(linearSearch(a, 0));		// This should return false
		System.out.println(linearSearch(a, 3));		// This should return true
		selectionSort(a);							// This should sort the array
		System.out.println(binarySearch(a, 0));		// This should return -1
		System.out.println(binarySearch(a, 3));		// This should return 2 (the index of value 3 once array is sorted)
		// END OF TEST DATA
	}
	
	////////////// DO ALL OF YOUR CODING BELOW THIS LINE! //////////////////////////////////
	
	public static boolean linearSearch(int[] a, int value){
		for(int i = 0; i < a.length; i++) {
			if(value == a[i]) {
				return true;
			}
			
		}
		return false;	// Placeholder to prevent Java error; remove when complete
	}
	
	public static void selectionSort(int[] a){
		  int n = a.length;
	      for (int i = 0; i < n-1; i++) {
	    	  int d = i;
	            for (int j = i+1; j < n; j++)
	                if (a[j] < a[d])
	                    d = j;
	            int temp = a[d];
	            a[d] = a[i];
	            a[i] = temp;
	        }
	    }
		
	
	public static int binarySearch(int[] a, int value){
		 int start = 0; 
		 int end = a.length - 1;
		 int mid = value;
	        while (start <= end) {
	            int b = start + (end - start) / 2;
	            if (a[b] == mid)
	                return b;
	            if (a[b] < mid)
	                start = b + 1;
	            else
	                end = b - 1;
	        }
		return -1;		
	}
}