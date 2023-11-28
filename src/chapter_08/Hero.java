package chapter_08;

//勇者の金型を作る
public class Hero {
	//ﾌｨｰﾙﾄﾞ(属性）
	String name;
	int hp;	
	
	//メソッド(操作・能力）
	public void sleep() {
		//眠ることでhpを100にする
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec) {
		//座って休んだ秒数分だけhpが増える
		this.hp += sec; //this.hp = this.hp + sec
		System.out.println(this.name + "は、" + sec + "秒座った");
		System.out.println("HPが" + sec + "ﾎﾟｲﾝﾄ回復した");
	}
	public void slip() {
		//転んで5ダメージ受ける
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ");
		System.out.println("5ポイントのダメージ！");
	}
	public void run() {
		//逃げるﾒｿｯﾄﾞ
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
