import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), c, maxCount = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] bowls = new int[50001];
		while (--N >= 0) {
			c = Integer.parseInt(st.nextToken());
			if (++bowls[c] > maxCount)
				maxCount = bowls[c];
		}
		if (maxCount == 1 && N >= 2)
			maxCount = 2;
		System.out.println(maxCount);
	}
}