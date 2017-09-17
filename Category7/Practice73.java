

/**
 * @author Fumomo
 * 練習問題 7 - 3
 * 前問の Dog クラスを使用して次のプログラムを作成しなさい。
 * ・Dog クラスのインスタンスを２つ作成する。
 * ・１つ目のインスタンスに、名前、年齢を設定する。
 * ・２つ目のインスタンスに、名前、年齢を設定する。
 * ・１つ目のインスタンスの、プロフィールを表示する。
 * ・２つ目のインスタンスの、プロフィールを表示する。
 */
public class Practice73 {
	public static void main(String[] args) {

		Dog2 dog1 = new Dog2();
		Dog2 dog2 = new Dog2();

		dog1.SetName("ポチ");
		dog1.SetAge(5);

		dog2.SetName("シロ");
		dog2.SetAge(3);

		dog1.ShowProfile();
		dog2.ShowProfile();

	}
}
