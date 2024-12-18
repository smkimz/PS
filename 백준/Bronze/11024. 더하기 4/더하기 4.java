import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine()), sum;
		while (--T >= 0) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens())
				sum += Integer.parseInt(st.nextToken());
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}