import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 14
 * 前の問題に次の修正を加えなさい。
 * １球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
 * ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
 * ３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
 */
public class Practice414 {

	public static void main(String[] args) throws IOException{
		int strike, ball, judge;

		strike = 0;
		ball = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(strike < 3 & ball < 4) {
			System.out.println("1:ストライク or 2:ボール or 3:ファウル");

			judge = Integer.parseInt(br.readLine());

			if((judge == 1) | (judge == 3 & strike < 2)) {
				++strike;
			}else if(judge == 2) {
				++ball;
			}
		}

		System.out.println("ストライク:" + strike + " ボール:" + ball);
	}

}
