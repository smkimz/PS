import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), x, volume = 4;
		while (st.hasMoreTokens()) {
			x = Integer.parseInt(st.nextToken());
			volume *= Math.max(x, N - x);
		}
		System.out.println(volume);
	}
}