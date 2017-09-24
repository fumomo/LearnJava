import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Fumomo
 * ハイ・カードゲーム
 * 出されたカードの数値が前に出させたカードの数値以上であれば勝ち
 */
public class HighCard {

    public static void main(String[] args) {
        int firstNumber = 0;            // 最初のカードの数値(比較用)
        int secondNumber = 0;           // 2番目のカードの数値
        int money = 100;                 // 所持金
        int bet = 0;                     // 賭け金
        int odds = 1;                    // オッズ
        int counter = 0;                 // 回数カウント用
        int continueSelect = 0;        // ゲームを続けるかどうかの選択結果
        boolean restartFlg = false;   // やり直し判定フラグ(true:やり直し false:継続)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rdm = new Random();

    	// 説明の表示
        System.out.println("A, 2 ～ 10, J, Q, Kの13種類のカードが有ります。");
        System.out.println("最初に１枚カードが出ますから掛け金を決めてください。");
        System.out.println("次に出るカードが前のカードと同じか大きければ、プレーヤーの勝ちです。");
        System.out.println("掛け金が戻りますから、続けて次のカードで勝負するかどうかを決めてください。");
        System.out.println("続けて勝てば戻る金額が２倍になります。以降、４倍、８倍と戻る金額が増えます。ただし、負けるとそれまでの勝ちはなくなります。");
        System.out.println("所持金が無くなって破産するか、1000 $ を超えるとゲーム終了です。");

        // 初期状態を表示
        System.out.println("----------------------------------------------");
        System.out.println("ゲームを開始します。所持金は100$です。");

        do{
            // 最初からやり直しであれば、カウンター、オッズ、やり直しフラグを初期化
        	if(restartFlg){
        		counter = 0;
        		odds = 1;
        		restartFlg =false;

        	}

        	// 回数のカウントアップ
            counter++;

            try{
                // 最初のカード提示
            	if(counter == 1){
            	    System.out.println("最初のカードです。");

                    firstNumber = rdm.nextInt(13) + 1;
                    System.out.println("| " + dispCardNumber(firstNumber) + " |");

                    // 賭け金の入力
                    System.out.print("いくら賭けますか？($1 ～ $" + money + ")");
                    bet = Integer.parseInt(br.readLine());
            	}

                // 2番目のカード提示
                secondNumber = rdm.nextInt(13) + 1;
                System.out.println("| " + dispCardNumber(secondNumber) + " |");

                // 先に出したほうが大きければ負け
                if(secondNumber < firstNumber){

                    // 所持金の計算(マイナスになるのであればゼロにする)
                    if(money < bet){
                    	money = 0;
                    }else {
                    	money = money - bet;
                    }

                    System.out.println("あなたの負け。所持金は $" + money + "です。\n" );
                    restartFlg = true;

                // 後に出した方が先に出した方以上であれば勝ち
                }else{

                    System.out.println("あなたの勝ち！$" + (bet*odds) + "の勝ちです");

                    System.out.print("倍率は" + (int)(Math.pow(2, counter)) + "倍。");

                    System.out.print("続けますか？（1=Yes; 0=No)");
                    continueSelect = Integer.parseInt(br.readLine());

                    // 1以外の値であれば、所持金を確定して1回目からやり直す
                    if(continueSelect != 1) {

                    	money = money + bet*odds;

                    	System.out.println("所持金は $" + money + "です。\n");
                        restartFlg = true;

                    // 続ける場合
                    }else{
                        // オッズと最初のカードの更新
                        odds = (int)Math.pow(2, counter);
                        firstNumber = secondNumber;

                    }
                }
            }catch(Exception e){
                System.out.println("不正な入力です");
                break;

            }

         // 所持金が$1000を超えるか、一文なしになったら終了
         }while(0 < money & money <= 1000);


        // 所持金の条件でループを抜けていれば結果を表示
        if(money == 0){
        	System.out.println("所持金がなくなったので、ゲーム終了です。");
        }else if(money > 0){
        	System.out.println("所持金が$1000を超えたので、ゲーム終了です。");
        }
    }


    /**
     * 数値をトランプのカードの形式にして表示する
     * 例えば、1 → A、13 → Kとなる
     * @return cardNumer  数値をトランプの形式で表した文字
     */
     static String dispCardNumber(int value){
        String cardNumber;

        switch(value){
            case 1:
                cardNumber = "A";
                break;

            case 11:
                cardNumber = "J";
                break;

            case 12:
            	cardNumber = "Q";
                break;

            case 13:
                cardNumber = "K";
                break;

            default:
                cardNumber = Integer.toString(value);
                break;
        }

        return cardNumber;
     }

}
