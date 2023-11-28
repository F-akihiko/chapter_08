package chapter_08;

public class Main {

	public static void main(String[] args) {
		/* 実行クラス(冒険の書）*/
		
		//１．勇者をインスタンス化
		Hero h = new Hero();
		
		//２．ﾌｨｰﾙﾄﾞのセット
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "(HP=" + h.hp + ")" + "が誕生した");
		
		//３．お化けキノコを二体インスタンス化
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		System.out.println(m1.name + m1.suffix + "が現れた");
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		System.out.println(m2.name + m2.suffix + "が現れた");
		
		//4.勇者とお化けキノコの操作
		h.slip();
		m1.run();
		m2.run();
		h.run();

	}

}
