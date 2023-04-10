package player;

public class PlayerTest {
	public static void main(String[] args) {
		
		Player player = new Player();
		
		beginnerLevel blevel = new beginnerLevel();
		player.setLevel(blevel);
		player.play(1);
		
		System.out.println("=============");
		
		AdvancedLevel alevel = new AdvancedLevel();
		player.setLevel(alevel);
		player.play(2);
		
		System.out.println("=============");
		
		SuperLevel slevel = new SuperLevel();
		player.setLevel(slevel);
		player.play(3);
		
		
	}
	
	

}
