import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, c, cSum;
		double g, gSum;
		StringTokenizer st;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			cSum = 0;
			gSum = 0;
			while (--N >= 0) {
				st = new StringTokenizer(br.readLine());
				c = Integer.parseInt(st.nextToken());
				g = Double.parseDouble(st.nextToken());
				cSum += c;
				gSum += c * g;
			}
			sb.append(cSum).append(' ').append(String.format("%.1f", gSum / cSum)).append("\n");
		}
		System.out.print(sb);
	}
}