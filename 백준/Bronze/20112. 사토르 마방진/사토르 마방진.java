import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[][] words = new char[N][];
		for (int i = 0; i < N; i++)
			words[i] = br.readLine().toCharArray();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (words[i][j] == words[j][i])
					continue;
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}