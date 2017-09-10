

/**
 * @author Fumomo
 * 練習問題 2 - 6
 * 年齢を訊ね、生まれてから現在までの、
 * おおよその日数を表示するプログラムを作成しなさい。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice26 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int x;

			System.out.println("年齢は？");

			x = Integer.parseInt(br.readLine());

			System.out.println("あなたが生まれてから約" + (365*x) + "日が経過しています。");

	}

}
