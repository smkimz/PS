import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] cards = new int[10];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++)
			cards[i] = Integer.parseInt(st.nextToken());
		int card, score = 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 10; i++) {
			card = Integer.parseInt(st.nextToken());
			if (card > cards[i])
				--score;
			else if (card < cards[i])
				++score;
		}
		if (score > 0)
			System.out.println('A');
		else if (score < 0)
			System.out.println('B');
		else
			System.out.println('D');
	}
}