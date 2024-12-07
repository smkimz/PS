import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int m = -1, f = -1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			f = Integer.parseInt(st.nextToken());
			if (m == 0 && f == 0)
				break;
			sb.append(m + f).append("\n");
		}
		System.out.print(sb);
	}
}