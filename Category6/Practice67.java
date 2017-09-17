

/**
 * @author Fumomo
 * 練習問題 6 - 7
 * ある数が素数かどうかを判定するメソッドを作成しなさい。
 * このメソッドを使用して 10000 以上 10100 未満の素数をすべて表示するプログラムを作成しなさい。
 */
public class Practice67 {

	public static void main(String[] args) {

		for(int i = 10000; i < 10100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static boolean isPrime(int value) {
		boolean Primeflg = true;

		if(value%2 == 0) {
			Primeflg = false;
		}else {
			for(int i = 3;i <= value/2; i += 2 ) {
				if(value%i == 0) {
					Primeflg = false;
					break;
				}
			}
		}

		return Primeflg;
	}

}
