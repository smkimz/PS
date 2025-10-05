import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		boolean[][] cards = new boolean[4][14];
		int[] a = new int['Z'];
		char[] b = new char[] { 'S', 'B', 'V', 'K' };
		char x;
		int y;
		for (int i = 0; i < b.length; i++)
			a[b[i]] = i;
		for (int i = 0; i < 51; i++) {
			st = new StringTokenizer(br.readLine());
			x = st.nextToken().charAt(0);
			y = Integer.parseInt(st.nextToken());
			cards[a[x]][y] = true;
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 1; j <= 13; j++) {
				if (cards[i][j])
					continue;
				System.out.printf("%c %d", b[i], j);
				return;
			}
		}
	}
}