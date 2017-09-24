import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Fumomo
 * すごろくゲーム
 */
public class Sugoroku {

	public static void main(String[] args){
        int dice = 0;        // 振るさいころの個数
        int outcome = 0;    // 出た目の合計
        int distance = 30;  // ゴールまでの距離
        int counter = 0;     // 回数のカウンター
        int ContinueSelect = 0;			// ゲームを続けるかどうかの選択結果

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 説明の表示
        System.out.println("30 マス先にゴールがあります。");
        System.out.println("1, 2, 3 の３つの目を持つ特別なサイコロ 10 個を、好きな数だけ振って駒を進めます。");
        System.out.println("ぴったり上がりに止まれば終わりです。目の数が多ければ、余った目の数だけ戻ります。");

        // 初期状態を表示
        System.out.println("=====================================================================");
        System.out.println("▲_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ |上がり！");

        try{
            // ゴールするまで繰り返す
            do{
                 // 回数の加算
                 counter++;

                 // さいころの個数の入力
                 System.out.print("残り" + distance + "マスです。サイコロの数は？");
                 dice = Integer.parseInt(br.readLine());

                 // 出目の計算
                 outcome = calcDiceNumber(dice);
                 System.out.println("\n出た目の合計 " + outcome);

                 // ゴールまでの残り距離の計算
                 distance = Math.abs(distance - outcome);

                 // すごろくの画面の表示


                 // ゴールした場合
                 if(distance == 0){
                     System.out.println("おめでとう！！ " + counter + "回目で上がりです!");
                     System.out.println("もう一度やりますか？（1=Yes; 0=No!）");

                     ContinueSelect = Integer.parseInt(br.readLine());

                     // 1以外の値であればやめる
                     if(ContinueSelect != 1){
                         break;
                     }
                 }


            }while(true);

        }catch(Exception e){
        	System.out.println("不正な入力です");

        }
	}


	/**
	 * さいころの出目を計算
	 * @param number    振るさいころの個数
	 * @return sum      出た目の合計
	 */
	static int calcDiceNumber(int number){
        int sum = 0;       // さいころの出た目の合計

        Random rdm = new Random();

        // 指定された数だけ1～3の間で乱数を生成し、その合計を算出
        for(int i = 0; i < number; i++){
            sum = sum + rdm.nextInt(3) + 1;

        }

        return sum;
	}

	/**
	 * すごろくのマスを表示する
	 * @param position  駒の位置
	 */
     static void dispSugoroku(int position){

        for(int i = 0; i < 30; i++){

            // 駒の位置は▲を表示
            if(i == position){
               System.out.print("▲");
            }else{
            	System.out.print("_ ");
            }

            System.out.print("|上がり！");
        }
     }
}
