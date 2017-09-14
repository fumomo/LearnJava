import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 9
 * 整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
 */
public class Pactice49 {

	public static void main(String[] args) throws IOException{
		int max, min, temp;

		max = 0;
		min = 0;
		temp = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0;i < 10 ;++i) {
			System.out.println("整数を入力してください");

			temp = Integer.parseInt(br.readLine());

			if(temp > max) {
				max = temp;
			}

			if(min > temp) {
				min = temp;
			}
		}

		System.out.println("最大値：" + max + " 最小値：" + min);
	}

}
