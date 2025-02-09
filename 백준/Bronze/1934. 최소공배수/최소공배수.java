import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		while (--T >= 0) {
			st = new StringTokenizer(br.readLine());
			sb.append(lcm(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()))).append("\n");
		}
		System.out.print(sb);
	}

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}