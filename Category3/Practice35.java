import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 3 - 5
 * 正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
 */
public class Practice35 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		if(x%2 == 0) {
			System.out.println("偶数です");
		}else {
			System.out.println("奇数です");
		}
	}
}
