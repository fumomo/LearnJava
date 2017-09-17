import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 7 - 5
 * 硬貨の入れ物のようなクラス、CoinCase を作成しなさい。
 * ・500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
 * ・AddCoins メソッドで硬貨を追加する。
 * ・引数は硬貨の種類（ int ）と枚数（ int ）。
 * ・GetCount メソッドで、指定した硬貨が、何枚あるかを取得する。
 *   引数は硬貨の種類（ int ）、戻り値は枚数（ int ）。
 * ・GetAmount メソッドで硬貨の総額を取得する。
 *   戻り値は硬貨の総額( int )。
 * CoinCase クラスを使用て次のプログラムを作成しなさい。
 * ・CoinCase クラスのインスタンスを作成する。
 * ・種類と枚数を入力し、AddCoins メソッドで硬貨を追加することを 10 回繰り返す。
 * ・各硬貨が何枚あるかを表示する。
 * ・総額を表示する。
 */
public class Practice76 {

	public static void main(String[] args) throws IOException{
		int type, amount;

		type = 0;
		amount = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		CoinCase cc = new CoinCase();

		for(int i = 0; i < 10; i++) {
			System.out.println("どの硬貨？");
			type = Integer.parseInt(br.readLine());

			System.out.println("何枚？");
			amount = Integer.parseInt(br.readLine());

			cc.AddCoins(type, amount);
		}

		System.out.println("1円玉:" + cc.GetCount(1) + "枚");
		System.out.println("5円玉:" + cc.GetCount(5) + "枚");
		System.out.println("10円玉:" + cc.GetCount(10) + "枚");
		System.out.println("50円玉:" + cc.GetCount(50) + "枚");
		System.out.println("100円玉:" + cc.GetCount(100) + "枚");
		System.out.println("500円玉:" + cc.GetCount(500) + "枚");

		System.out.println("合計:" + cc.GetAmount() + "円");
	}
}

class CoinCase{

	private int ichiyen = 0;
	private int goyen = 0;
	private int juuyen = 0;
	private int gojuuyen = 0;
	private int hyakuyen = 0;
	private int gohyakuyen = 0;


	void AddCoins(int type, int amount) {

		switch(type) {
			case 1:
				ichiyen = ichiyen + amount;
				break;

			case 5:
				goyen = goyen + amount;
				break;

			case 10:
				juuyen = juuyen + amount;
				break;

			case 50:
				gojuuyen = gojuuyen + amount;
				break;

			case 100:
				hyakuyen = hyakuyen + amount;
				break;

			case 500:
				gohyakuyen = gohyakuyen + amount;
				break;

			default:
				break;
		}
	}

	int GetCount(int type) {

		switch(type) {
			case 1:
				return ichiyen;

			case 5:
				return goyen;

			case 10:
				return juuyen;

			case 50:
				return gojuuyen;

			case 100:
				return hyakuyen;

			case 500:
				return gohyakuyen;

			default:
				return 0;
		}

	}

	int GetAmount() {
		return (ichiyen + goyen*5 + juuyen*10 + gojuuyen*50 + hyakuyen*100 + gohyakuyen*500);
	}
}
