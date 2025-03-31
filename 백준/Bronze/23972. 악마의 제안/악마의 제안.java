import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long K = Long.parseLong(st.nextToken()), N = Long.parseLong(st.nextToken()), ret;
		if (N == 1) {
			System.out.println(-1);
			return;
		}
		ret = K * N / (N - 1);
		if ((K * N) % (N - 1) != 0)
			++ret;
		System.out.println(ret);
	}
}