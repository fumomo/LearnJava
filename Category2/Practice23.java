

/**
 * @author Fumomo
 * 練習問題 2 - 3
 * int 型の変数 x に数値を入力し、
 * x を 1 乗、2 乗、3 乗した結果を表示するプログラムを作成しなさい。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice23 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int x = Integer.parseInt(br.readLine());

			System.out.println(x);
			System.out.println(x*x);
			System.out.println(x*x*x);
	}

}
