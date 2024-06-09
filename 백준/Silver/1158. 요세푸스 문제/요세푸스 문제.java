import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("<");
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int out = 0, cnt = K, seq = K;
		boolean[] check = new boolean[N + 1];
		while (out < N) {
			if (seq > N)
				seq = 1;
			if (check[seq]) {
				seq++;
				continue;
			}
			if (cnt == K) {
				sb.append(seq);
				check[seq] = true;
				cnt = 1;
				seq++;
				out++;
				if (out < N)
					sb.append(", ");
				continue;
			}
			cnt++;
			seq++;
		}
		sb.append(">");
		System.out.println(sb);
	}
}