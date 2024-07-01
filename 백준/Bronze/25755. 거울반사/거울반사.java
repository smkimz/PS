import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] temp = { ' ', '1', '5', '?', '?', '2', '?', '?', '8', '?' };
		HashMap<Character, Character> mirror = new HashMap<Character, Character>();
		for (int i = 1; i <= 9; i++)
			mirror.put((char) (i + '0'), temp[i]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		char W = st.nextToken().charAt(0);
		int N = Integer.parseInt(st.nextToken());
		char[][] arr = new char[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				arr[i][j] = st.nextToken().charAt(0);
		}
		if (W == 'L' || W == 'R') {
			for (int i = 0; i < N; i++) {
				for (int j = N - 1; j >= 0; j--)
					sb.append(mirror.get(arr[i][j])).append(" ");
				sb.append("\n");
			}
		} else if (W == 'U' || W == 'D') {
			for (int i = N - 1; i >= 0; i--) {
				for (int j = 0; j < N; j++)
					sb.append(mirror.get(arr[i][j])).append(" ");
				sb.append("\n");
			}
		}
		System.out.print(sb);
	}
}