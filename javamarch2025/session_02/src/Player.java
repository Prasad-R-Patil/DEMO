public class Player {	
	private String playerName;
	private String playerCountry;
	
	public Player()
	{
		this("Dhoni");
		playerCountry = "India";
	}
	
	public Player(String playerName)
	{
		//this();
		this.playerName = playerName;
	}
	
	public String display()
	{
		return "PlayerName = "+playerName+" PlayerCountry = "
				+playerCountry;
	}
	
	public static void main(String[] args) {	
		Player p1 = new Player();
		System.out.println(p1.display());	
	}
}
