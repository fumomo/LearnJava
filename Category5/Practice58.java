import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 5 - 8
 * 整数を 10 回入力し、小さい順に並べ替えて表示するプログラムを作成しなさい。
 */
public class Practice58 {

	public static void main(String[] args) throws IOException{
		int[] num;
		int temp;

		num = new int[10];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(int i = 0; i < 10; i++) {
				num[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 1;j <10 ; j++) {
			for(int k = 0; k < 9; k++) {
				if(num[k] > num[k + 1]) {
					temp = num[k];
					num[k] = num[k + 1];
					num[k + 1] = temp;
					}
			}
		}

		for(int k = 0; k < 10; k++) {
			System.out.print(num[k] + " ");
		}

		br.close();
	}
}
