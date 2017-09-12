import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 3 - 9
 * 曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、
 * 休診であるかを表示するプログラムを作成しなさい。
 * 開いているか、休診であるかは、次の表に従います。
 *			日曜	月曜	火曜	水曜	木曜	金曜	土曜
 *	午前	休診	○		休診	○		○		休診	○
 *	午後	休診	○		○		○		○		○		休診
 *	夜間	休診	○		○		休診	○		○		休診

 */
public class Practice39 {

	public static void main(String[] args) throws IOException{

		int day, time;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("以下のガイドに従って曜日を入力してください");
		System.out.println("0=日曜 1=月曜 2=火曜 3=水曜 4=木曜 5=金曜 6=土曜");

		day = Integer.parseInt(br.readLine());

		System.out.println("以下のガイドに従って時間を入力してください");
		System.out.println("0=午前 1=午後 2=夜間");

		time = Integer.parseInt(br.readLine());

		if((day == 0)| ((day == 2 | day == 5) & time == 0)
				|((day == 3 | day == 6) & time == 2)|( day == 6 & time == 1)) {
			System.out.println("休診日です");
		}else {
			System.out.println("開いています");
		}
	}

}
