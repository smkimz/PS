import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int B, min = 256, max = 0;
	static int[] heights = new int[257], ans = new int[] { Integer.MAX_VALUE, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), input;
		B = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				input = Integer.parseInt(st.nextToken());
				++heights[input];
				max = Math.max(max, input);
				min = Math.min(min, input);
			}
		}
		for (int i = min; i <= max; i++)
			checkTime(i);
		System.out.print(sb.append(ans[0]).append(" ").append(ans[1]));
	}

	static void checkTime(int height) {
		int time = 0, block = B;
		block = B;
		for (int i = height + 1; i <= max; i++) {
			if (heights[i] == 0)
				continue;
			time += (i - height) * heights[i] * 2;
			block += (i - height) * heights[i];
			if (time > ans[0])
				return;
		}
		for (int i = min; i < height; i++) {
			if (heights[i] == 0)
				continue;
			time += (height - i) * heights[i];
			block -= (height - i) * heights[i];
			if (block < 0 || time > ans[0])
				return;
		}
		ans[0] = time;
		ans[1] = height;
	}
}