import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 4 - 12
 * 数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示する
 * プログラムを作成しなさい。
 */
public class Practice412 {

	public static void main(String[] args) throws IOException{
		int sum = 0;

		sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(sum <= 100) {
			sum = sum + Integer.parseInt(br.readLine());
		}

		System.out.print(sum);
	}

}
