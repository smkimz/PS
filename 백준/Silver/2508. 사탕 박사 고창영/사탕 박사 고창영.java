import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), R, C, ans;
		char[][] box;
		while (--T >= 0) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			box = new char[R][C];
			ans = 0;
			for (int i = 0; i < R; i++)
				box[i] = br.readLine().toCharArray();
			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					if (box[r][c] != 'o')
						continue;
					if (c != 0 && c != C - 1 && box[r][c - 1] == '>' && box[r][c + 1] == '<')
						++ans;
					else if (r != 0 && r != R - 1 && box[r - 1][c] == 'v' && box[r + 1][c] == '^')
						++ans;
				}
			}
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}