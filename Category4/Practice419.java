import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 4 - 19
 * 数値を繰り返して入力し、0 が入力されたら入力を止め、
 * 平均値を表示するプログラムを作成しなさい。
 * ※ 	最後に入力された 0 は平均に含めない。
 * ※ 	少なくとも 1 回は入力が行われるものとする。（最初に 0 を入力してはいけない）
 */
public class Practice419 {

	public static void main(String[] args) throws IOException{
		int num ,sum, count;

		num = 0;
		sum = 0;
		count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true) {
			num = Integer.parseInt(br.readLine());

			if(num == 0) {
				break;
			}else {
				++count;
				sum = sum + num;
			}
		}

		System.out.println(sum/count);

	}

}
