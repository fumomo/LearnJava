import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 2 - 2
 * int 型の変数 x に数値を入力し、x の値を表示するプログラムを作成しなさい。
 */


public class Practice22 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int x = Integer.parseInt(br.readLine());

			System.out.println(x);
	}

}
