import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken()), sum = 0;
		int[] S = new int[N];
		for (int i = 0; i < N; i++) {
			S[i] = Integer.parseInt(br.readLine());
			sum += S[i];
		}
		D /= sum;
		for (int i = 0; i < N; i++)
			sb.append(S[i] * D).append("\n");
		System.out.print(sb);
	}
}