import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Fumomo
 *
 */
public class Radar {

	public static void main(String[] args){
		int target = 0;					// ターゲット
		int position = 0;					// 入力値
		int range = 0;						// 範囲
		int counter;						// 回数カウント用
		int ContinueSelect = 0;			// ゲームを続けるかどうかの選択結果


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rdm = new Random();

		// 説明の表示
		System.out.println("レーダー");
		System.out.println("ターゲットとして 0 ～ 100 のうち、１つの数が設定されます。探索する位置と範囲を入力してターゲットを見つけてください。");
		System.out.println("ターゲットと探索位置の差が探索範囲以下であれば“ヒット”と表示し、探索範囲より大きければ“はずれ”と表示します。");
		System.out.println("探索位置とターゲットが一致すれば正解です。");

		System.out.println("==========================================================================");
		System.out.println("ゲームを開始します。");

		try {
			do{
				// ターゲットの設定
				target = rdm.nextInt(100);
				System.out.println("ターゲットを設定しました。");

				// 試行回数の初期化
				counter = 0;

				// 当たるまで繰り返す
				do {
					// 回数のインクリメント
					counter++;

					System.out.print("位置は？");
					position = Integer.parseInt(br.readLine());

					System.out.print("\n範囲は？");
					range = Integer.parseInt(br.readLine());

					if(target == position) {
						System.out.println("\nあたりです！ " + counter + "回目で正解しました！");
						break;

					}else if(Math.abs(target - position) < range) {
						System.out.println("\nヒットしました！");

					}else {
						System.out.println("\nはずれました！");
					}

				}while(true);

				System.out.println("もう一度やりますか？（1=Yes; 0=No)");
				ContinueSelect = Integer.parseInt(br.readLine());

				// 1以外の値であればやめる
				if(ContinueSelect != 1) {
					break;
				}

			}while(true);

		}catch(Exception e){
			System.out.println("不正な入力です");
		}
	}
}
