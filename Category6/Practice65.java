

/**
 * @author Fumomo
 * 練習問題 6 - 5
 * サイズを示す数値と、表示する文字を引数とし、三角形を表示するメソッドを作成しなさい。
 * このメソッドを使用して、サイズと文字の異なる３つの三角形を表示しなさい。
 */
public class Practice65 {

	public static void main(String[] args) {

		dispTriangle(3, '*');

		System.out.println();

		dispTriangle(4, '%');

		System.out.println();

		dispTriangle(5, '&');
	}

	static void dispTriangle(int size, char moji) {

		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(moji);
			}
			System.out.print("\n");
		}

	}

}
