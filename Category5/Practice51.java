import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 5 - 1
 * 次のプログラムを作成しなさい。
 * 10 個の数値を入力する。
 * 入力された各々の数値を 2 倍にして表示する。
 */
public class Practice51 {

	public static void main(String[] args) throws IOException{
		int[] num;

		num = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < 10; j++) {
			System.out.print(num[j]*2 + " ");
		}
	}

}
