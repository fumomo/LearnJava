import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 6
 * 整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、
 * 勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
 */
public class Practice46 {

	public static void main(String[] args) throws IOException{
		int win, lose, input;

		win = 0;
		lose = 0;
		input = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0;i < 10 ;++i) {
			System.out.println("0か1を入力してください");

			input = Integer.parseInt(br.readLine());

			if(input == 1) {
				++win;
			}else if(input == 0) {
				++lose;
			}
		}

		System.out.println("勝ち：" + win + " 負け：" + lose);
	}

}
