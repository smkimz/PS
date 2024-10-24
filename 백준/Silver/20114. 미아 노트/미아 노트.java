import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), H = Integer.parseInt(st.nextToken()),
				W = Integer.parseInt(st.nextToken());
		char[][] note = new char[H][N * W];
		for (int i = 0; i < H; i++)
			note[i] = br.readLine().toCharArray();
		boolean checker;
		for (int i = 0; i < N; i++) {
			checker = false;
			for (int r = 0; r < H && !checker; r++) {
				for (int c = 0; c < W; c++) {
					if (note[r][i * W + c] != '?') {
						sb.append(note[r][i * W + c]);
						checker = true;
						break;
					}
				}
			}
			if (!checker)
				sb.append("?");
		}
		System.out.print(sb);
	}
}