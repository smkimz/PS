import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		char[][] lines = new char[3][];
		int[] nums = new int[3];
		int d = 0, base;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j <= 2; j++)
				lines[j] = br.readLine().toCharArray();
			for (int j = 0; j < M; j++) {
				d = 0;
				base = j * 8;
				for (int k = 0; k <= 2; k++)
					nums[k] = lines[1][base + 1 + 2 * k] - '0';
				if (lines[1][j * 8 + 6] != '.') {
					d = 1;
					nums[2] = nums[2] * 10 + lines[1][base + 6] - '0';
				}
				if (nums[0] + nums[1] != nums[2]) {
					for (int k = 0; k <= 2; k++)
						lines[k][base + 3 - k] = '/';
				} else {
					for (int k = 0; k <= 2; k++) {
						if (k == 1) {
							lines[1][base] = '*';
							lines[1][base + 6 + d] = '*';
						} else {
							for (int l = 1; l <= 5 + d; l++)
								lines[k][base + l] = '*';
						}
					}
				}
			}
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < lines[j].length; k++)
					sb.append(lines[j][k]);
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}