import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N;
		HashMap<String, Integer> firstPublicKey;
		int[] secondPublicKey;
		String[] plainText;
		StringTokenizer st;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			firstPublicKey = new HashMap<>();
			secondPublicKey = new int[N];
			plainText = new String[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				firstPublicKey.put(st.nextToken(), i);
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				secondPublicKey[i] = firstPublicKey.get(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				plainText[secondPublicKey[i]] = st.nextToken();
			for (int i = 0; i < N; i++)
				sb.append(plainText[i]).append(" ");
			sb.append("\n");
		}
		System.out.print(sb);
	}
}