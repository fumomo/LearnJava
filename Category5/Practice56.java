import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 5 - 6
 * 次のコードに追加し、九九表を表示するプログラムを完成させなさい。
 */
public class Practice56 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];

		//配列 kuku に値を代入する
		for(int row = 0; row < 9; row++) {
			for(int column = 0;column < 9; column++) {
				kuku[row][column] = (row + 1)*(column + 1);
			}
		}

		for( int i = 0 ; i < 9 ; i++ )
		{
			for( int j = 0 ; j	< 9 ; j++ )
				System.out.printf( " %2d", kuku[i][j] );

			System.out.println();
		}
	}

}
