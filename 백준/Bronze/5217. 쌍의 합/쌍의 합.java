import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder[] sb = new StringBuilder[13];
		sb[0] = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n, i;
		while (--T >= 0) {
			n = Integer.parseInt(br.readLine());
			if (sb[n] != null) {
				sb[0].append(sb[n]);
				continue;
			}
			sb[n] = new StringBuilder("Pairs for ").append(n).append(": ");
			if (n <= 2) {
				sb[n].append("\n");
				sb[0].append(sb[n]);
				continue;
			}
			i = 1;
			while (i < n - i) {
				sb[n].append(i).append(' ').append(n - i).append(", ");
				++i;
			}
			sb[n].delete(sb[n].length() - 2, sb[n].length() - 1).append("\n");
			sb[0].append(sb[n]);
		}
		System.out.print(sb[0]);
	}
}