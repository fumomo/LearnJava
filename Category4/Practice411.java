import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 11
 * 個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
 * 数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
 */
public class Practice411 {

	public static void main(String[] args) throws IOException{
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		count = Integer.parseInt(br.readLine());

		for(int i = 0;i < count ;++i) {
			System.out.print(i%10);
		}
	}

}
