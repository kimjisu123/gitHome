package player;

public class Player {

	PlayerLevel level;

	public PlayerLevel getLevel() {
		return level;
	}

	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
		level.go(count);
	}
	
	
}
