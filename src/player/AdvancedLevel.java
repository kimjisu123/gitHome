package player;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("플레이어가 빠르게 뜁니다");		
	}

	@Override
	public void jump() {
		System.out.println("플레이어가 점프를 합니다");		
	}

	@Override
	public void turn() {
		System.out.println("플레이어의 레벨이 부족하여 턴을 하지 못합니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("플레이어의 직업은 중수 입니다.");
	}

}
