

/**
 * @author Fumomo
 * 練習問題 7 - 2
 * 前問の Dog クラスに、次の内容を追加しなさい。
 * ・年齢を保持する int 型のメンバー変数。
 * ・年齢を設定するメンバー・メソッド、SetAge。
 * ・ShowProfile メソッドで名前、年齢を表示するようにする。
 * 修正した Dog クラスを使用して次のプログラムを作成しなさい。
 * ・Dog クラスのインスタンスを作成する。
 * ・名前、年齢を設定する。
 * ・プロフィールを表示する。
 */
public class Practice72 {
	public static void main(String[] args) {

		Dog2 dog = new Dog2();

		dog.SetName("ポチ");
		dog.SetAge(5);

		dog.ShowProfile();

	}
}

class Dog2
{
    private String Name;
    private int age;

    public void SetName( String nm )
    {
        Name = nm;
    }

    public void SetAge(int value) {
    	age = value;
    }

    public void ShowProfile()
    {
        System.out.println( "名前は、" + Name + "。年齢は" + age + "歳です。" );
    }
}