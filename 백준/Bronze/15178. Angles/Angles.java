import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), angle, sum;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			while (st.hasMoreTokens()) {
				angle = Integer.parseInt(st.nextToken());
				sum += angle;
				sb.append(angle).append(" ");
			}
			if (sum == 180)
				sb.append("Seems OK\n");
			else
				sb.append("Check\n");
		}
		System.out.print(sb);
	}
}