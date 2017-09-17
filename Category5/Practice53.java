import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 5 - 3
 * のプログラムを作成しなさい。
 * ・10 個の数値を入力する。
 * ・入力された数値を偶数と奇数に分類して表示する。
 */
public class Practice53 {

	public static void main(String[] args) throws IOException{
		int[] num;

		num = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 10; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("偶数:");

		for(int j = 0;j < 10 ; j++) {
			if(num[j]%2 == 0) {
				System.out.print(num[j] + " ");
			}
		}

		System.out.print("\n奇数:");

		for(int k = 0;k < 10 ; k++) {
			if(num[k]%2 == 1) {
				System.out.print(num[k] + " ");
			}
		}


	}

}
