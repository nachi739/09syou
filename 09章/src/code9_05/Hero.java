package code9_05;

public class Hero {
	String name;
	int hp;
	Sword sword;
	public void atack() {
		System.out.println(this.name + "は" + this.sword.name +"攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}
}
