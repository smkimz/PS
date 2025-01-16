import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N, s1, s2, s3;
		while (--T >= 0) {
			N = Integer.parseInt(br.readLine());
			s1 = N * (N + 1) / 2;
			s2 = N * (1 + (N - 1));
			s3 = N * (2 + (N - 1));
			sb.append(s1).append(" ").append(s2).append(" ").append(s3).append("\n");
		}
		System.out.print(sb);
	}
}