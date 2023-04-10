package player;

public class beginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("플레이어가 뜁니다");
	}

	@Override
	public void jump() {
		System.out.println("플레이어가 점프를 합니다");
	}

	@Override
	public void turn() {
		System.out.println("플레이어의 레벨이 매우 부족하여 턴을 하지 못합니다");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("플레이어의 직업은 초보자 입니다");
	}

}
