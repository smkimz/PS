import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken()),
				z = Integer.parseInt(st.nextToken()), m = x + y + z, maxVal = 0, maxCount = 0;
		int[] dice = new int[81];
		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				for (int k = 1; k <= z; k++)
					++dice[i + j + k];
			}
		}
		for (int i = 2; i <= m; i++) {
			if (dice[i] <= maxCount)
				continue;
			maxVal = i;
			maxCount = dice[i];
		}
		System.out.println(maxVal);
	}
}