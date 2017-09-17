import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 4 - 1
 * 2 以上の数値を入力し、素因数分解した結果を表示しなさい。
 */
public class Practice416 {

	public static void main(String[] args) throws IOException{
		int num, factor;

		num = 0;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		num = Integer.parseInt(br.readLine());

		while(num > 1) {
			factor = 0;

			if(num%2 == 0) {
				factor = 2;
			}else if(num > 5){
				for(int i = 3;i <= num/2; i += 2 ) {

					if(num%i == 0) {
						factor = i;
						break;
					}else {
						factor = num;
					}
				}
			}else {
				factor = num;
			}

			System.out.print(factor + " ");
			num = num/factor;
		}
	}

}
