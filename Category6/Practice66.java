

/**
 * @author Fumomo
 * 練習問題 6 - 6
 * 九九のひとつの段を表示するメソッドを作成しなさい。何の段（ 1 ～ 9 ）であるかを引数とします。
 * このメソッドを使用して、九九表を作成しなさい。
 */
public class Practice66 {
	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			dispKuku(i);
		}
	}

	static void dispKuku(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%2d ", i*dan);
		}

		System.out.println();
	}
}
