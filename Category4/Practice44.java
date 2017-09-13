

/**
 * @author Fumomo
 * 練習問題 4 - 4
 * 7 の階乗を計算し、表示するプログラムを作成しなさい。
 */
public class Practice44 {

	public static void main(String[] args) {
		int x = 1;

		for(int i =7;i >= 1;i--) {
			x = x*i;
		}

		System.out.println(x);
	}

}
