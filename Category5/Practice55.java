import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 5 - 5
 * 入力された数値を 16 桁の２進数で表示するプログラムを完成させなさい。
 */
public class Practice55 {


	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );

		int value = Integer.parseInt( br.readLine() );

		int binary[] = new int[16];

		//配列 binaryに0か1を代入する
		for(int cnt = 15;cnt >= 0;cnt--) {
			if(value == 0) {
				binary[cnt] = 0;
			}else {
				binary[cnt] = value%2;
				value = value/2;
			}
		}

		for( int i = 0 ; i < 16 ; i++ )
			System.out.print( binary[i] );
		}

}
