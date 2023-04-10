package player;

public abstract class PlayerLevel  extends Player{

	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	
	public void go(int count) {
		run();
		for(int i =1; i <= count; i++) {
			jump();
		}
		turn();
		showLevelMessage();
		
	}
	
}
