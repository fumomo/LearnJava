

/**
 * @author Fumomo
 * 練習問題 1 - 7
 * int 型の変数 x、y に任意の数値を代入し、
 * x の値を y に、y の値を x に入れ替えて
 * x と y の値を表示するプログラムを作成しなさい。
 */
public class Practice7 {

	public static void main(String[] args) {

		int x = 7;
		int y = 10;
		int tmp;

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("x = " + x + ", y = " + y);
	}

}
