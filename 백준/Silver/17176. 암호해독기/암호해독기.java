import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] check = new int[2][53];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			check[0][Integer.parseInt(st.nextToken())]++;
		String plaintext = br.readLine();
		char c;
		for (int i = 0; i < N; i++) {
			c = plaintext.charAt(i);
			if (c >= 'A' && c <= 'Z')
				check[1][c - 'A' + 1]++;
			else if (c >= 'a' && c <= 'z')
				check[1][c - 'a' + 27]++;
			else
				check[1][0]++;
		}
		for (int i = 0; i <= 52; i++) {
			if (check[0][i] == check[1][i])
				continue;
			System.out.println("n");
			return;
		}
		System.out.println("y");
	}
}
