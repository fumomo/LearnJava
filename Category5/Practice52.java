import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 5 - 2
 * 次のプログラムを作成しなさい。
 * ・10 個の数値を入力する。
 * ・入力された順番と逆の順番で 10 個の数値を表示する。
 */
public class Practice52 {

	public static void main(String[] args) throws IOException{
		int[] num;

		num = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 9; j >= 0; j--) {
			System.out.print(num[j] + " ");
		}
	}

}
