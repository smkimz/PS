import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), start, end, idx, cnt, T = 0, S = 0;
		int[][] reservation = new int[2][368];
		int[] ans = new int[6];
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			if (st.nextToken().charAt(0) == 'T')
				idx = 0;
			else
				idx = 1;
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			++reservation[idx][start];
			--reservation[idx][end + 1];
			ans[5] = Math.max(ans[5], end - start + 1);
		}

		for (int i = 1; i <= 366; i++) {
			T += reservation[0][i];
			S += reservation[1][i];
			cnt = T + S;
			if (cnt == 0)
				continue;
			++ans[1];
			ans[2] = Math.max(ans[2], cnt);
			if (T == S) {
				++ans[3];
				ans[4] = Math.max(ans[4], cnt);
			}
		}

		for (int i = 1; i <= 5; i++)
			sb.append(ans[i]).append("\n");
		System.out.print(sb);
	}
}