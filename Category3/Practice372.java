import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 3 - 7
 * 試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
 * 試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
 * ケース2
 *  80 点以上：“たいへんよくできました。”
 *  60 点以上、80 点未満：“よくできました。”
 *  60 点未満：“ざんねんでした。”
 */
public class Practice372 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(br.readLine());

		if(x >= 80) {
			System.out.println("たいへんよくできました");
		}else if(x >=60){
			System.out.println("よくできました");
		}else {
			System.out.println("ざんねんでした");
		}
	}
}
