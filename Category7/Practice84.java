

/**
 * @author Fumomo
 * 練習問題 8 - 4
 * 前問で作成したクラスを使用して、次のプログラムを作成しなさい。
 * Animal クラスの配列を作成する。要素数は 4。
 * 配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、
 * 奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
 * 配列の総ての要素の Speak メソッドを実行する。
 */
public class Practice84 {

	public static void main(String[] args) {
		Animal2 animals[];

		animals = new Animal2[4];

		animals[0] = new Cat2();
		animals[1] = new Dog5();
		animals[2] = new Cat2();
		animals[3] = new Dog5();

		for(int i = 0; i < 4; i++) {
			animals[i].Speak();
		}
	}

}
