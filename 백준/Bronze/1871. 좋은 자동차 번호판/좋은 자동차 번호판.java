import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x;
		char[] P;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine(), "-");
			x = 0;
			P = st.nextToken().toCharArray();
			for (int i = 0; i < 3; i++)
				x += (P[i] - 'A') * Math.pow(26, 2 - i);
			x -= Integer.parseInt(st.nextToken());
			if (Math.abs(x) <= 100)
				sb.append("nice\n");
			else
				sb.append("not nice\n");
		}
		System.out.print(sb);
	}
}