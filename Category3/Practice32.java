import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 3 - 2
 * ２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
 */
public class Practice32 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if(x >y) {
			System.out.println(x);
		}else {
			System.out.println(y);
		}
	}
}
