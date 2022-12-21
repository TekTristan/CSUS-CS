// Your name here: Tristan Dinh

package Main;

public class Lab09{
	   
	public static void main(String[] args){
	       // My tests (DO NOT MODIFY!)
	       int[] a = {3,2,6,4,15,7,9,8,6};
	       p(recurseSum(a));               // Sum should be 60
	       p(recurseMax(a));               // Max should be 15
	       // End of tests!
	   }
	  
	   // Recursive methods below here...
	   public static int recurseSum(int[] a){
	       //
	       return recurseSumHelper(a, 0);
	   }
	   
	   public static int recurseSumHelper(int[] a, int i) {
	       //
	       if(i >= a.length) {
	           return 0;
	       }
	       return a[i] + recurseSumHelper(a, i + 1);
	   }
	  
	   public static int recurseMax(int[] a){
	       //
		   return recurseMaxHelper(a, 0);
	   }
	 
	   public static int recurseMaxHelper(int[] a, int i) {
	       //
		   if(i >= a.length) {
	           return 0;
	       }
	       return Math.max(a[i], recurseMaxHelper(a, i + 1));
	   }
	   
	   public static <E> void p(E item){
	       System.out.println(item);
	   }
	}