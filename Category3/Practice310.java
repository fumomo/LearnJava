import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Fumomo
 * 練習問題 3 - 10
 * 整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。
 * ・x は y より小さく、かつ、x と y は共に偶数である。
 * ・x と y は等しく、かつ、負の数である。
 * ・x は y より小さい、または、x は偶数である。
 * ・x は 10 以下または 100 以上で、かつ、y は 10 以上かつ 100 以下である。
 * ・x も y も負の数である、ではない。（ x も y も負の数である、の否定）
 */
public class Practice310 {

	public static void main(String[] args) throws IOException{

		int x, y;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		x = Integer.parseInt(br.readLine());
		y = Integer.parseInt(br.readLine());

		if(x <y & (x%2 == 0 & y%2 ==0))
		    System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );

		if( x == y & x <0 & y < 0)
		    System.out.println( "xとyは等しく、かつ、負の数である。" );

		if( x < y | x%2 == 0 )
		    System.out.println( "xはyより小さい、または、xは偶数である。" );

		if( (x <= 10 | 1000 <= x) & ( 10 <= y & y <= 100) )
		    System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );

		if( !(x <0 & y < 0) )
		    System.out.println( "xもyも負の数である、ではない。" );
		}

}
