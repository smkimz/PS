import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Z = Integer.parseInt(br.readLine()), w, k;
		StringTokenizer st;
		while (--Z >= 0) {
			st = new StringTokenizer(br.readLine());
			w = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			sb.append((w * k) / 2).append("\n");
		}
		System.out.print(sb);
	}
}