import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), x = N * (N + 1) / 2, y;
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (--N > 0) {
			y = Integer.parseInt(st.nextToken());
			x -= y;
		}
		System.out.println(x);
	}
}
