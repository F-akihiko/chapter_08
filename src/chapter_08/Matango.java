package chapter_08;

//お化けキノコの金型を作成
public class Matango {
	//ﾌｨｰﾙﾄﾞ(属性）
	String name = "マタンゴ";
	int hp;
	final int LEVEL = 10;
	char suffix;
	
	//メソッド
	public void run() {
		System.out.println("お化けキノコ" + this.suffix + "は、逃げ出した！");
	}
}
