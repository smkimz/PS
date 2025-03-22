import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] cards = new boolean[200001];
		int N = Integer.parseInt(br.readLine()), a, x = 200001, y = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N >= 0) {
			a = Integer.parseInt(st.nextToken());
			cards[a] = true;
			x = Math.min(x, a);
			y = Math.max(y, a);
		}
		y = Math.min(y, 199994);
		for (int i = x; i <= y; i++) {
			if (cards[i] && cards[i + 3] && cards[i + 6]) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}