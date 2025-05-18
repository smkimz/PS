import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		double x, y;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Double.parseDouble(st.nextToken());
			y = Double.parseDouble(st.nextToken());
			sb.append(String.format("%.1f\n", Math.abs(x - y)));
		}
		System.out.print(sb);
	}
}