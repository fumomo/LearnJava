import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 3 - 12
 * 好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
 * ※ 	switch 文を使用する。
 * ※ 	選択は、“1：まぐろ　2：えび　3：こはだ．．．”のようなガイドを表示し数字で入力させる。
 */
public class Practice312 {

	public static void main(String[] args) throws IOException{

		int sushi;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("以下から好きなネタを入力してください");
		System.out.println("1:まぐろ 2:たまご 3:えんがわ 4:あなご");


		sushi = Integer.parseInt(br.readLine());

		switch(sushi){
			case 1:
				System.out.println("ラッキーアイテムは醤油さしです");
				break;

			case 2:
				System.out.println("ラッキーアイテムはごはんです");
				break;

			case 3:
				System.out.println("ラッキーアイテムはお茶です");
				break;

			case 4:
				System.out.println("ラッキーアイテムはお味噌汁です");
				break;

			default:
				System.out.println("占えません");
				break;

		}

	}

}
