import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 5
 * 整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
 */
public class Practice45 {

	public static void main(String[] args) throws IOException{
		int x = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0;i < 10 ;++i) {
			System.out.println("整数を入力してください");

			x = x + Integer.parseInt(br.readLine());
		}

		System.out.println("平均は" + x/10 + "です");
	}

}
