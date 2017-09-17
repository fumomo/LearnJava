import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 6 - 3
 * ２つの整数の大きい方を選ぶメソッドを作成しなさい。
 * ２つの int 型引数を取り、大きい方の数値を戻り値として返すこと。
 * また、このメソッドを使用して、int 型の変数 x、y、z にそれぞれ数値を入力し、
 * 最も大きい数値を表示するプログラムを作成しなさい。
 */
public class Practice63 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		int z = Integer.parseInt(br.readLine());
		int max;

		max = choicLarger(choicLarger(x, y),z);

		System.out.println(max);


	}

	static int choicLarger(int x, int y) {
		return x>y?x:y;
	}

}
