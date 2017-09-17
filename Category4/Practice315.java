import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 4 - 15
 * 入力された数が素数かどうかを判定するプログラムを作成しなさい。
 * ※ 	判定する数は 4 以上としてよい。
 */
public class Practice315 {

	public static void main(String[] args) throws IOException{
		int num = 0;
		boolean primeflg = true;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());

		if(num%2 == 0) {
			primeflg = false;
		}else {
			for(int i = 3;i <= num/2; i += 2 ) {
				if(num%i == 0) {
					primeflg = false;
				}
			}
		}

		if(primeflg) {
			System.out.print("素数です");
		}else
			System.out.print("素数ではありません");
		}
}




