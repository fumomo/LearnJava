

/**
 * @author Fumomo
 * サイズを示す数値（int）を引数とし、
 * 何等かの文字で例のような三角形を表示するメソッドを作成しなさい。
 * また、このメソッドを使用してサイズ 3、4、5 の３つの三角形を
 * 表示するプログラムを作成しなさい。
 */
public class Practice64 {

	public static void main(String[] args) {

		dispTriangle(3);

		System.out.println();

		dispTriangle(4);

		System.out.println();

		dispTriangle(5);
	}

	static void dispTriangle(int size) {

		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("$");
			}
			System.out.print("\n");
		}

	}
}
