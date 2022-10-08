// Your name here: Tristan Dinh

package main;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Lab02{
	public static void main(String[] args){
		// My code to dynamically create a small movie database (DO NOT MODIFY OR REMOVE!)
		String[] movies = new String[5];
		movies[0] = "Shawshank Redemption*1994*Tim Robbins*2.36";
		movies[1] = "The Godfather*1972*Al Pacino*2.92";
		movies[2] = "Raging Bull*1980*Robert De Niro*2.15";
		movies[3] = "Million Dollar Baby*2004*Hilary Swank*2.2";
		movies[4] = "Straight Outta Compton*2015*Jason Mitchell*2.45";
		//End of code
		String[] titles = new String[5];
		int[] years = new int[5];
		String[] stars = new String[5];
		float[] runtimes = new float[5];
		 
		for (int i = 0; i < movies.length; i++) {
			try {
				String raw = movies[i];
				StringTokenizer st = new StringTokenizer(raw, "*");
				titles[i] = st.nextToken();
				years[i] = Integer.parseInt(st.nextToken());
				stars[i] = st.nextToken();
				runtimes[i] = Float.parseFloat(st.nextToken());
			}catch(NoSuchElementException e) {
				System.out.println("NoSuchElementException found.");
		}
	}
		
	System.out.println("----MOVIES----");
		for(String str:titles) {
			System.out.println(str);
	}
	System.out.println("-----YEARS-----");
		for(int str:years) {
			System.out.println(str);
	}	
	System.out.println("-----STARS-----");
		for(String str:stars) {
			System.out.println(str);
	}
	System.out.println("-----RUNTIMES-----");
		for(float str:runtimes) {
			System.out.println(str);
	}
		
		// End of code
		
		// TODO: Write your code to parse the data, and display the data in a meaningful way...
		// (Use the instructions in the hand out to complete the assignment for full credit)
		
	}
}