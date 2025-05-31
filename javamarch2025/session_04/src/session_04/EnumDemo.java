package session_04;
public class EnumDemo {
	public enum Coffee{SMALL(45),MEDIUM(60),LARGE(90);	
		private int price;
		
		private Coffee(int price)
		{
			this.price = price;
		}
		
		public int getPrice()
		{
			return price;
		}	
	};
	public static void main(String[] args) {
		Coffee c = Coffee.MEDIUM;
		System.out.println(c+" "+c.getPrice());
	}
}
