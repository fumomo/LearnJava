import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 7
 * 次のプログラムを作成しなさい。
 * 巨人、阪神戦で毎回の得点を入力する。（１回～９回）
 * 入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
 * ※ 	試合は巨人の先行とする。
 */
public class Practice47 {

	public static void main(String[] args) throws IOException{
		int kyojin, hanshin, tokuten;

		kyojin = 0;
		hanshin = 0;
		tokuten = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 1;i < 10 ;++i) {
			System.out.println(i + "回の表、巨人の得点は");

			tokuten = Integer.parseInt(br.readLine());
			kyojin = kyojin + tokuten;

			System.out.println(i + "回の裏、阪神の得点は");

			tokuten = Integer.parseInt(br.readLine());
			hanshin = hanshin + tokuten;

		}

		System.out.println("巨人：" + kyojin + " 阪神：" + hanshin);

		if(kyojin > hanshin) {
			System.out.println("巨人の勝ち");
		}else if(hanshin > kyojin) {
			System.out.println("阪神の勝ち");
		}else {
			System.out.println("引き分け");
		}
	}

}
