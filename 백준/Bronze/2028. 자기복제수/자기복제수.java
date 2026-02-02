import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), X;
		String N, M;
		while (--T >= 0) {
			N = br.readLine();
			X = (int) Math.pow(Integer.parseInt(N), 2);
			M = String.valueOf(X);
			M = M.substring(M.length() - N.length(), M.length());
			sb.append(N.equals(M) ? "YES\n" : "NO\n");
		}
		System.out.print(sb);
	}
}