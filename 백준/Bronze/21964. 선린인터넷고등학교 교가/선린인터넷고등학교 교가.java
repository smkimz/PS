import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		char[] S = br.readLine().toCharArray();
		for (int i = N - 5; i < N; i++)
			sb.append(S[i]);
		System.out.print(sb);
	}
}