

/**
 * @author Fumomo
 * 練習問題 8 - 3
 * public void Speak()
 * {
 *     System.out.println( "......" );
 * }
 * Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。
 * Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
 * 次のプログラムを作成しなさい。
 * ・Cat クラスと Dog クラスのインスタンスを作成する。
 * ・それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
 * ・それぞれの ShowProfile を実行する。
 * ・それぞれの Speak を実行する。
 */
public class Practice83 {

	public static void main(String[] args) {

		Cat2 cat = new Cat2();
		Dog5 dog = new Dog5();

		cat.Name = "タマ";
		cat.Age = 4;

		dog.Name = "ポチ";
		dog.Age = 3;

		cat.ShowProfile();
		dog.ShowProfile();

		cat.Speak();
		dog.Speak();
	}

}


class Animal2
{
    public String Name;
    public int Age;

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "、" + Age + "歳です。" );
    }

    public void Speak()
    {
        System.out.println( "......" );
    }
}

class Cat2 extends Animal2{

	public void Sleep() {
		System.out.println("スースー");
	}

	public void Speak() {
		 System.out.println( "ニャー" );
	}
}

class Dog5 extends Animal2{

	public void Run() {
		System.out.println("トコトコ");
	}

	public void Speak() {
		 System.out.println( "ワンワン" );
	}
}