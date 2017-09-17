import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 5 - 4
 * 数値を繰り返して入力し、合計が 100 を超えた場合、
 * または入力が 10 回行われた場合、入力を止め入力された数値を
 * すべて表示するプログラムを作成しなさい。
 */
public class Practice54 {

	public static void main(String[] args) throws IOException{
		int[] num;
		int sum;
		int i;

		num = new int[10];
		sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(i = 0; i < 10 & sum <=100; i++) {
			num[i] = Integer.parseInt(br.readLine());

			sum = sum + num[i];

		}

		for(int j = 0; j < i; j++) {
			System.out.print(num[j] + " ");
		};

	}

}
