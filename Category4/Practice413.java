import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 4 - 13
 * ストライク・カウントを数えるプログラムを作成しなさい。
 * １球ごとにストライクかボールかを入力する。
 * ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
 * ※ 	ストライクの場合は1、ボールの場合は2を入力する。
 */
public class Practice413 {

	public static void main(String[] args) throws IOException{
		int strike, ball, judge;

		strike = 0;
		ball = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(strike < 3 & ball < 4) {
			System.out.println("1:ストライク or 2:ボール");

			judge = Integer.parseInt(br.readLine());

			if(judge == 1) {
				++strike;
			}else if(judge == 2) {
				++ball;
			}
		}

		System.out.println("ストライク:" + strike + " ボール:" + ball);
	}

}
