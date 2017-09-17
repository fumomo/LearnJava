import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Fumomo
 * 練習問題 4 - 21
 * サイズを示す数値を入力し、そのサイズの×印を何等かの文字で
 * 表示するプログラムを作成しなさい。
 */
public class Practice421 {

	public static void main(String[] args) throws IOException{
		int size;

		size = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		size = Integer.parseInt(br.readLine());

		for(int i = 1;i <= size; i++) {
			for(int j = 0;j < size; j++) {
				if((j + 1) == i |j == (size - i)) {
					System.out.print("X");
				}else{
					System.out.print(" ");
				}

				if(j == (size-1)) {
					System.out.print("\n");
				}
			}
		}
	}
}