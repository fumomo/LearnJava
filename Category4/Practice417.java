

/**
 * @author Fumomo
 * 練習問題 4 - 17
 * 九九表（一の段～九の段）を表示するプログラムを作成しなさい。
 */
public class Practice417 {

	public static void main(String[] args) {

		for(int i = 1;i <= 9;i++) {
			for(int j = 1;j <= 9;j++) {
				if(j == 9) {
					System.out.printf("%2d \n", i*j);
				}else {
					System.out.printf("%2d ", i*j);
				}
			}
		}
	}

}
