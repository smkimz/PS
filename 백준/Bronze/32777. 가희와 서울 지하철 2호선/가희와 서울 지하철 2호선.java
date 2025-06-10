import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int Q = Integer.parseInt(br.readLine()), a, b;
		while (--Q >= 0) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			a -= b;
			if ((a < 0 && a >= -21) || a > 21)
				sb.append("Inner circle line\n");
			else
				sb.append("Outer circle line\n");
		}
		System.out.print(sb);
	}
}