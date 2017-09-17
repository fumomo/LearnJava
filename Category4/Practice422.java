

/**
 * @author Fumomo
 * 練習問題 4 - 22
 * フィボナッチ数列を表示するプログラムを作成しなさい。
 * 最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
 */
public class Practice422 {

	public static void main(String[] args) {
		int a_1, a_2, a_n;

		a_1 = 0;
		a_2 = 1;
		a_n = 0;

		System.out.print(a_1 + " " + a_2);

		 while(true){

			a_n = a_1 + a_2;

			if(a_n > 1000) {
				break;
			}else {
				System.out.print(" " + a_n);
		 	}

			a_1 = a_2;
			a_2 = a_n;
		}
	}
}
