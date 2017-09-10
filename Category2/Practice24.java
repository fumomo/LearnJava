

/**
 * @author Fumomo
 * 練習問題 2 - 4
 * int 型の変数 x、y にそれぞれ数値を入力し、
 * x と y の和、差（x－y）、積、商と余り(x÷y)、
 * を表示するプログラムを作成しなさい。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Practice24 {

	public static void main(String[] args) throws IOException{

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int x = Integer.parseInt(br.readLine());
			int y = Integer.parseInt(br.readLine());

			System.out.println("和：" + (x+y));
			System.out.println("差：" + (x-y));
			System.out.println("積：" + x*y);
			System.out.println("商：" + x/y + "  余り：" + x%y);
	}

}
