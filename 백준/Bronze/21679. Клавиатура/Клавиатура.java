import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), K;
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] keys = new int[N + 1];
		for (int i = 1; i <= N; i++)
			keys[i] = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while (--K >= 0)
			--keys[Integer.parseInt(st.nextToken())];
		for (int i = 1; i <= N; i++)
			sb.append(keys[i] < 0 ? "yes\n" : "no\n");
		System.out.print(sb);
	}
}
