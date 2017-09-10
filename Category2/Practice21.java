

/**
 * @author Fumomo
 * 練習問題 2 - 1
 * String 型の変数 s に文字列を入力し、s の値を表示するプログラムを作成しなさい。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice21 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String s = br.readLine();

			System.out.println(s);
	}

}