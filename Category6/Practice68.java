

/**
 * @author Fumomo
 * 練習問題 6 - 8
 * メソッドを再帰的に呼び出すことによって、
 * フィボナッチ数列の n 番目の項を計算するメソッドを作成しなさい。
 * 最初の２つの項、0 番目を 0、1 番目を 1 とします。
 * このメソッドを使用して、11 番目から 20 番目までの項を
 * するプログラムを作成しなさい。
 */
public class Practice68 {

	public static void main(String[] args) {

		for (int i = 11; i <= 20; i++) {
			System.out.print(calcFibonacci(i) + " ");
		}
	}

	static int calcFibonacci(int item) {

		if(item == 1) {
			return 0;
		}else if(item == 2) {
			return 1;
		}else {
			return (calcFibonacci(item - 1) + calcFibonacci(item - 2));
		}
	}

}
