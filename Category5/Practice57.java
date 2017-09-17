import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 5 - 7
 * 1 桁の数値（ 1 ～ 9 に限定）を２つ入力し、その積を表示するプログラムを作成しなさい。
 * ただし、九九の計算結果が入った配列を予め作成して利用すること。（前問を参考に）
 */
public class Practice57 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );

		int kuku[][] = new int[9][9];
		int num1, num2;

		num1 = 0;
		num2 = 0;

		//配列 kuku に値を代入する
		for(int row = 0; row < 9; row++) {
			for(int column = 0;column < 9; column++) {
				kuku[row][column] = (row + 1)*(column + 1);
			}
		}

		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());

		System.out.println(kuku[num1 - 1][num2 - 1]);
	}
}
