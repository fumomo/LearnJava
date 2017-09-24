import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 駅にピッタリ電車を停めるゲーム
 * ブレーキの強弱を操作して電車を停める
 */
public class Station {

	public static void main(String[] args) {
        int velocity;            // 電車の速度
        int distance;            // 駅からの距離
        int brake;                // ブレーキの強さ
        int second;               // 経過秒数
        int inputBrake = 0;      // ユーザからのブレーキ指示(2:強く 1:弱く 0:そのまま)
        int continueSelect = 0;			// ゲームを続けるかどうかの選択結果


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        // ゲームの説明
        System.out.println("列車は時速 100 km/h で走っています。駅までの距離は 500 m です。");
        System.out.println("ブレーキを強くしたり、弱くしたりしながら駅に停車してください。");
        System.out.println("ブレーキは毎回、１段階だけ強くしたり弱くしたりできます。");



        // 初期表示
        System.out.println("------------------------------------------------------------------");

        while(true) {

            // 設定値の初期化
            velocity = 100;
            distance = 500;
            brake = 0;
            second = 0;

            try {
                do {

                    second++;

                    // 現在の状態の表示
                    dispTrain(distance);

                    System.out.println("残り距離 " + distance + "m 速度 "+ velocity + "km/h ブレーキの強さ" + brake);

                    // ブレーキの入力
                    System.out.print("ブレーキの強さは？(2=強く、1=弱く、0=そのまま)");
                    inputBrake = Integer.parseInt(br.readLine());

                    // ブレーキの強さの決定
                    if(inputBrake == 2){
                        brake++;
                    }else if(inputBrake == 1 & brake > 0){
                        brake--;
                    }

                    // 速度と残り距離の計算
                    velocity = calcVelocity(velocity, brake);
                    distance = calcDistance(velocity, distance);

                    if(velocity <= 0){
                        System.out.println(second + "秒 駅までの距離 " + distance + "mで停車しました。");

                    }

                }while(velocity > 0);

                // 継続するかどうかの確認
                System.out.print("もう一度やりますか？（1=Yes; 0=No!）");
                continueSelect = Integer.parseInt(br.readLine());

                // 1以外の値であればやめる
                if(continueSelect != 1) {
                    break;
                }

            }catch(Exception e){
                System.out.println("不正な入力です。");
                break;

            }
        }

    }


    /**
     * 電車の現在の位置を表示する
     * アンダーバー一つあたり約10メートル
     * @param position 電車の現在位置(駅からの距離)
     */
    static void dispTrain(int position) {


        // 繰り返しの回数の計算
        position = (position - position%10)/10;

        //
        for(int i = 0;i < position; i++) {
            System.out.print("_");

        }

        // 車両の表示
        System.out.println("□□□");
    }

    /**
     * ブレーキ後の時速を計算する。計算式は以下の通り
     * (ブレーキ後の時速) = (現在の時速) － (ブレーキの強さ)
     * @param formerVelocity  現在の速度
     * @param brakeLevel  ブレーキの強さ
     * @return  計算後の速度
     */
    static int calcVelocity(int formerVelocity, int brakeLevel){

        return (formerVelocity - brakeLevel);
    }

    /**
     * 駅までの残り距離を計算する。計算式は以下の通り。
     * (残り距離) = (現在の距離) - (秒速)
     * (秒速) = ( (時速) × 10 )＋ 35 ) ÷ 36
     * @param distance  現在の駅までの残り距離
     * @param velocity  時速
     * @return  計算後の駅までの残り距離
     */
    static int calcDistance(int velocity, int distance){

    	// 時速を秒速に変換
    	velocity = (velocity*10 + 35)/36;
    	return (distance - velocity);
    }

}
