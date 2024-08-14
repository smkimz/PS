import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken()), idx = 0;
		char[] str = br.readLine().toCharArray();
		while (K > 0 && idx < N) {
			if (str[idx] != 'A' && 'Z' - str[idx] < K) {
				K -= 'Z' - str[idx] + 1;
				str[idx] = 'A';
			}
			++idx;
		}

		if (K > 0) {
			K %= 26;
			str[N - 1] += K;
			if (str[N - 1] > 'Z') {
				K = str[N - 1] - 'Z';
				str[N - 1] = (char) ('A' - 1 + K);
			}
		}
		for (int i = 0; i < N; i++)
			sb.append(str[i]);
		System.out.println(sb);
	}
}