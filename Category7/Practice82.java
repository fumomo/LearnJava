
/**
 * @author Fumomo
 * 練習問題 8 - 2
 * 前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
 * ・Dog はメンバー・メソッドRunを持つ。
 * ・Run を実行すると“トコトコ”という文字列を表示する。
 * 次のプログラムを作成しなさい。
 * ・Cat クラスと Dog クラスのインスタンスを作成する。
 * ・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
 * ・それぞれの ShowProfile を実行する。
 * ・Cat のインスタンスの Sleep を実行する。
 * ・Dog のインスタンスの Run を実行する。
 */
public class Practice82 {

	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog4 dog = new Dog4();

		cat.Name = "タマ";
		cat.Age = 4;

		dog.Name = "ポチ";
		dog.Age = 3;

		cat.ShowProfile();
		dog.ShowProfile();

		cat.Sleep();
		dog.Run();
	}

}

class Dog4 extends Animal{

	public void Run() {
		System.out.println("トコトコ");
	}
}