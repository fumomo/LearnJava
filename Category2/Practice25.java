

/**
 * @author Fumomo
 * 練習問題 2 - 5
 * ２つの整数値を入力し、平均値を求めるプログラムを作成しなさい。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice25 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());

			System.out.println("平均 ： " + (x+y)/2);
	}

}
