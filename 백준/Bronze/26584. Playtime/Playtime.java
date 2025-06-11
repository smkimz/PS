import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int[] x = new int[] { 525600, 1440, 60, 1 };
		String[] y = new String[] { " year(s)", " day(s)", " hour(s)", " minute(s)" };
		int Q = Integer.parseInt(br.readLine()), time, div;
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine(), ",");
			sb.append(st.nextToken()).append(" -");
			time = Integer.parseInt(st.nextToken());
			for (int i = 0; i < 4; i++) {
				div = time / x[i];
				if (div == 0)
					continue;
				sb.append(' ').append(div).append(y[i]);
				time %= x[i];
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}