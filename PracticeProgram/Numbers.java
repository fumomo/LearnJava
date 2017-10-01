import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Fumomo
 *
 */
public class Numbers {

	public static void main(String[] args) {
        int[] answer;           // 正解の4桁の数字。桁数が大きいものから順に格納
        String input = null;     // ユーザの入力した数値
        int[] inputArray;        // ユーザの入力を配列に変換


        inputArray = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("4桁の数を当ててください。");
        System.out.println("同じ数字は１度しか使用されません。最上位に0が使用される場合もあります。");
        System.out.println("ヒントとして、合っている数字の数と、桁（位置）も合っている数字の数を示します。");
        System.out.println("答えが'4135'で入力が'0123'の場合、'数:2,桁:1'とヒントが出ます。");

        System.out.println("----------------------------------------------------");

        // 解答の作成
        answer = createAnswer();
        System.out.println("4桁の数を考えました！！");

        // 正解するまでループ
        do{

            try{
                // 入力値の読み込み
                System.out.println("数を当ててください。");
                input = br.readLine();

                // 入力値を配列化
                inputArray = createInputArray(input);

                for(int i = 0; i < 4; i++){
                System.out.print(answer[i]);
                }
            }catch(Exception e){

            }
        }while(false);
	}



    /**
     * 重複のない4つの数字を生成する
     * @return numbers  4つの数字を格納した配列
     */
    static int[] createAnswer(){
        int[] numbers;	               // 生成された4桁の数字を格納
        int tmpValue = 0;            // 正解となる数字の候補値
        int index = 0;                // 現在設定している配列のインデックス
        boolean uniqueFlg;   // 非重複フラグ(true:重複なし false:重複あり)

        numbers = new int[4];
        Random rdm = new Random();

        // 各桁に値を格納する
        do{
            // 非重複フラグの初期化
        	uniqueFlg = true;

            // 候補となる値の作成
            tmpValue = rdm.nextInt(10);

            // 最初の数字はそのまま格納して次の要素へ移動
            if(index == 0){
                numbers[index] = tmpValue;
                index++;

            // 2つ目以降はこれまでに出ていなければ格納
            }else{

                // 重複チェック
                for(int i = 0; i < index; i++){

                    if(tmpValue == numbers[i]){
                    	uniqueFlg = false;
                    }
                }

                // 他と重複がなければ格納して次の要素へ移動
                if(uniqueFlg){
                    numbers[index] = tmpValue;
                    index++;
                }
            }


        }while(index < 4);

        return numbers;
	}

    /**
     * 引数の数値を桁ごとに分割し、配列に格納する
     * @param value 数値(文字列)
     * @return valueIntArray 引数を数値化して格納した配列
     */
    static int[] createInputArray(String value){
        int[] valueIntArray;              // 引数を数値化して配列に格納したもの
        String[] valueStringArray;

        // 引数を1文字ずつ分割して配列に格納
        valueStringArray = value.split("", 0);

        // 戻り値を引数の文字数と同じ配列で初期化
        valueIntArray = new int[value.length()];

        // 要素ごとに数値化して戻り値に代入
        for(int i = 0; i < valueIntArray.length; i++) {
        	valueIntArray[i] = Integer.parseInt(valueStringArray[i]);
        }

        return valueIntArray;

    }
}
