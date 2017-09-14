import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 10
 * 個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
 */
public class Practice410 {

	public static void main(String[] args) throws IOException{
		int count = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		count = Integer.parseInt(br.readLine());

		for(int i = 0;i < count ;++i) {
			System.out.print("*");
		}
	}

}
