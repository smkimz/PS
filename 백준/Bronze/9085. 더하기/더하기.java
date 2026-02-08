import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, sum;
		StringTokenizer st;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			sum = 0;
			while (--N >= 0)
				sum += Integer.parseInt(st.nextToken());
			sb.append(sum).append("\n");
		}
		System.out.print(sb);
	}
}