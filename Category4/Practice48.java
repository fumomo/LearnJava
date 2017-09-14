import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 8
 * 自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
 */
public class Practice48 {

	public static void main(String[] args) throws IOException{
		int max, temp;

		max = 0;
		temp = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0;i < 10 ;++i) {
			System.out.println("自然数を入力してください");

			temp = Integer.parseInt(br.readLine());

			if(temp > max) {
				max = temp;
			}
		}

		System.out.println("最大値：" + max);
	}

}
