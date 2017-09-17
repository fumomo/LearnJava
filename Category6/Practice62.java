

/**
 * @author Fumomo
 * 練習問題 6 - 2
 * ２つの整数の平均を計算するメソッドを作成しなさい。
 * ２つの int 型引数を取り、結果を int 型の戻り値として返すこと。
 * また、メソッドの動作を検証できるようにプログラムを作成しなさい。
 */
public class Practice62 {

	public static void main(String[] args) {

		System.out.println(calcAverage(4,10));
	}

	static int calcAverage(int x, int y) {
		return (x + y)/2;
	}

}
