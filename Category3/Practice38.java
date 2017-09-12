import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author Fumomo
 * 練習問題 3 - 8
 * 中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、
 * 次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
 * ・両方とも 60 点以上の場合、合格
 * ・合計が 130 点以上の場合、合格
 * ・合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
 * ・上記以外は不合格
 *
 */
public class Practice38 {

	public static void main(String[] args) throws IOException{

		int x, y;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("中間試験の点数は？");

		x = Integer.parseInt(br.readLine());

		System.out.println("期末試験の点数は？");

		y = Integer.parseInt(br.readLine());


		if((x >= 60 & y >= 60 )| ((x + y) >= 130)|
			((x + y) >= 100) & (x >= 90)|(y >= 90)) {
			System.out.println("合格です");
		}else {
			System.out.println("不合格です");
		}

	}

}
