package chapter_08;

import java.util.Random;

public class Cleric {

	//ﾌｨｰﾙﾄﾞ
	String name;
	int hp = 50;
	int MAX_HP = 50;//最大hp
	int mp = 10;
	int MAX_MP = 50;//最大mp
	
	//セルフエイドメソッド
	public void selfAid(){
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}
	//祈るメソッド
	public int pray(int sec){
		System.out.println(this.name + "は、祈るを唱えた！");
		System.out.println("何秒祈りますか？");
		int aidHp = new Random().nextInt(3) + sec;
		if(aidHp > this.MAX_HP) {
			aidHp = this.MAX_HP;
		}
		System.out.println(this.name + "は、" + aidHp + "回復した");
		return aidHp;
	}
}
