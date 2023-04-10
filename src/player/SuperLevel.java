package player;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("플레이어가 매우 빠르게 뜁니다");		
	}

	@Override
	public void jump() {
		System.out.println("플레이어가 점프를 합니다");		
	}

	@Override
	public void turn() {
		System.out.println("플레이어가 턴을 합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("플레이어의 직업은 고수 입니다");
	}

}
