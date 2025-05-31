package session_03;

public class EnumDemo {
	
	public enum Seasons{WINTER,SUMMER,RAINY}
	
	public static void main(String[] args) {
		
		Seasons s = Seasons.SUMMER;
		System.out.println(s);
		
		for(Seasons s1:Seasons.values())
		{
			System.out.println(s1+" "+s1.ordinal());
		}
	}

}
