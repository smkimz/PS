import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, val, min, max;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			min = 1000000;
			max = -1000000;
			while (--N >= 0) {
				val = Integer.parseInt(st.nextToken());
				min = Math.min(min, val);
				max = Math.max(max, val);
			}
			sb.append(min).append(" ").append(max).append("\n");
		}
		System.out.print(sb);
	}
}