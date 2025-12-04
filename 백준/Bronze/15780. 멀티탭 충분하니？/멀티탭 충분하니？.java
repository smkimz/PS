import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), x, max = 0;
		st = new StringTokenizer(br.readLine());
		while (--K >= 0) {
			x = Integer.parseInt(st.nextToken());
			max += (x / 2) + (x % 2);
		}
		System.out.println(max >= N ? "YES" : "NO");
	}
}
