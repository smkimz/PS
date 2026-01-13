import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken()) - 1, C = Integer.parseInt(st.nextToken()) - 1;
		char[][] pic = new char[R + 1][C + 1];
		char piece;
		for (int i = 0; i <= C; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j <= R; j++)
				pic[j][C - i] = st.nextToken().charAt(0);
		}
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				piece = st.nextToken().charAt(0);
				if (piece == pic[i][j])
					continue;
				sb.append("|>___/|     /}\n| O O |    / }\n( =0= )\"\"\"\"  \\\n| ^  ____    |\n|_|_/    ||__|");
				System.out.print(sb);
				return;
			}
		}
		sb.append("|>___/|        /}\n| O < |       / }\n(==0==)------/ }\n| ^  _____    |\n|_|_/     ||__|");
		System.out.print(sb);
	}
}