import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 3 - 4
 * int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、
 * x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と
 * 表示するプログラムを作成しなさい。
 */
public class Practice34 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());

		if(x >y) {
			System.out.println("xはyより大きい");
		}else if(x <y) {
			System.out.println("xはyより小さい");
		}else {
			System.out.println("xとyは等しい");
		}
	}
}
