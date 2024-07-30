import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer boxes = new StringTokenizer(br.readLine());
		StringTokenizer books = new StringTokenizer(br.readLine());
		int box = Integer.parseInt(boxes.nextToken()), book = Integer.parseInt(books.nextToken()), ans = 0;
		while (true) {
			if (box >= book) {
				box -= book;
				if (!books.hasMoreTokens()) {
					ans += box;
					break;
				}
				book = Integer.parseInt(books.nextToken());
				continue;
			}
			ans += box;
			if (!boxes.hasMoreTokens())
				break;
			box = Integer.parseInt(boxes.nextToken());
		}
		while (boxes.hasMoreTokens())
			ans += Integer.parseInt(boxes.nextToken());
		System.out.println(ans);
	}
}