import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), p, t;
		StringTokenizer st;
		while (--N >= 0) {
			st  = new StringTokenizer(br.readLine());
			p = Integer.parseInt(st.nextToken());
			t = Integer.parseInt(st.nextToken());
			sb.append(p + (t / 4) - (t / 7)).append("\n");
		}
		System.out.print(sb);
	}
}