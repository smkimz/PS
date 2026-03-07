import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] c = new char[128];
		c[46] = 46;
		c[79] = 79;
		c[45] = 124;
		c[124] = 45;
		c[47] = 92;
		c[92] = 47;
		c[94] = 60;
		c[60] = 118;
		c[118] = 62;
		c[62] = 94;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		char[][] b = new char[N][M];
		for (int i = 0; i < N; i++)
			b[i] = br.readLine().toCharArray();
		for (int i = M - 1; i >= 0; i--) {
			for (int j = 0; j < N; j++)
				sb.append(c[b[j][i]]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}