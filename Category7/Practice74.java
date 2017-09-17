/**
 *
 */

/**
 * @author Fumomo
 * 練習問題 7 - 4
 * 前問の Dog クラスに、次の内容を追加しなさい。
 * ・犬種を保持するメンバー変数。（ String 型）
 * ・犬種を設定する引数（ String ）を持つコンストラクタ。
 * ・ShowProfile メソッドを犬種、名前、年齢、を表示するようにする。
 * 修正した Dog クラスを使用して次のプログラムを作成しなさい。
 * ・犬種を指定して Dog クラスのインスタンスを作成する。
 * ・名前、年齢を設定する。
 * ・プロフィールを表示する。
 */
public class Practice74 {

	public static void main(String[] args) {

		Dog3 dog = new Dog3("柴犬");

		dog.SetName("ポチ");
		dog.SetAge(5);

		dog.ShowProfile();

	}
}


class Dog3
{
    private String Name, type;
    private int age;

    Dog3(String shurui){
    	type = shurui;
    }

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void SetAge(int value) {
    	age = value;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "。年齢は" + age + "歳、犬種は" + type + "です。" );
    }
}