import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), A = Integer.parseInt(st.nextToken()),
				B = Integer.parseInt(st.nextToken());
		char[] S = br.readLine().toCharArray();
		for (int i = 0; i <= A - 2; i++)
			sb.append(S[i]);
		for (int i = B - 1; i >= A - 1; i--)
			sb.append(S[i]);
		for (int i = B; i < N; i++)
			sb.append(S[i]);
		System.out.println(sb);
	}
}