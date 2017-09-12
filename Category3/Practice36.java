import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 3 - 6
 * 整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
 * “正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
 * ※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
 * ※ 	0 は“正の偶数”であるとする。
 */
public class Practice36 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		if(x >= 0) {
			if(x%2 ==0) {
				System.out.println("正の偶数");
			}else {
				System.out.println("正の奇数");
			}
		}else {
			if(x%2 ==0) {
				System.out.println("負の偶数");
			}else {
				System.out.println("負の奇数");
			}
		}
	}
}
