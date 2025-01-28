import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), N, ans;
		double W, C, cpw;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			ans = 100000;
			cpw = 100000.0;
			while (--N >= 0) {
				st = new StringTokenizer(br.readLine());
				W = Double.parseDouble(st.nextToken());
				C = Double.parseDouble(st.nextToken());
				if (C / W < cpw) {
					cpw = C / W;
					ans = (int) C;
				} else if (C / W == cpw)
					ans = (int) Math.min(ans, C);
			}
			sb.append(ans).append("\n");
		}
		System.out.print(sb);
	}
}