import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 4 - 20
 * サイズを示す数値を入力し、何等かの文字で例のような
 * 三角形を表示するプログラムを作成しなさい。
 * サイズ 4 の例
 * $
 * $$
 * $$$
 * $$$$
 */
public class Practice420 {

	public static void main(String[] args) throws IOException{
		int size;

		size = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		size = Integer.parseInt(br.readLine());

		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.print("\n");
		}
	}
}

