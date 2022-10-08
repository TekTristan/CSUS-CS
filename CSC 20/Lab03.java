package main;

public class Lab03 implements name, date, game {
	
	public static void main(String[] args) {
		Lab03 inf = new Lab03();
		System.out.println(inf.fullName("Tristan"," Chi"," Dinh"));
		inf.birthDate();
		inf.gameName();
		
	}
	public void gameName() {
		game.gameName();
	}
	public String fullName(String deez, String mid, String nutz) {
		return deez + mid + nutz;
		
	}
	@Override
	public void fullName() {
		
	}
	@Override
	public String fullName(String fn, String ln) {
		// TODO Auto-generated method stub
		return null;
	}

}
	interface name{
		void fullName();
		String fullName(String fn, String ln);
		
		
	}
	interface date{
		default void birthDate() {
			System.out.println("I was born in December 4th, 2002");
		}
	}
	interface game{
		public static void gameName() {	
			System.out.println("I like to play Valorant and Call of Duty");
			
		}
	}
	


