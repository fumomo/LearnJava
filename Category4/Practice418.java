import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 18
 * 数値を繰り返して入力し、0 が入力されたら入力を止め、
 * それまでの合計を表示するプログラムを作成しなさい。
 */
public class Practice418 {

	public static void main(String[] args) throws IOException{
		int num ,sum;

		num = 0;
		sum = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			num = Integer.parseInt(br.readLine());

			if(num == 0) {
				break;
			}else {
				sum = sum + num;
			}
		}

		System.out.println(sum);

	}

}
