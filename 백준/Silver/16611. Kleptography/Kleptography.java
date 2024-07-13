import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
		char[] lastletters = br.readLine().toCharArray(), ciphertext = br.readLine().toCharArray();
		int[] plaintext = new int[M], diff = new int[M];
		for (int i = M - 1; i >= M - N; i--) {
			plaintext[i] = lastletters[i - M + N];
			diff[i] = (ciphertext[i] - lastletters[i - M + N] + 26) % 26;
		}
		for (int i = M - N - 1; i >= 0; i--) {
			plaintext[i] = diff[i + N] + 'a';
			diff[i] = (ciphertext[i] - plaintext[i] + 26) % 26;
		}
		for (int i = 0; i < M; i++)
			sb.append((char) (plaintext[i]));
		System.out.println(sb);
	}
}