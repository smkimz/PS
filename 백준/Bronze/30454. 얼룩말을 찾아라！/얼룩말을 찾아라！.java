import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), L = Integer.parseInt(st.nextToken()), count, x = 0, y = 0;
		char[] zebra;
		boolean isBlackStripe;
		while (--N >= 0) {
			zebra = br.readLine().toCharArray();
			count = 0;
			isBlackStripe = false;
			for (int i = 0; i < L; i++) {
				if (zebra[i] == '0')
					isBlackStripe = false;
				else if (!isBlackStripe) {
					++count;
					isBlackStripe = true;
				}
			}
			if (count > x) {
				x = count;
				y = 1;
			} else if (count == x)
				++y;
		}
		System.out.printf("%d %d", x, y);
	}
}