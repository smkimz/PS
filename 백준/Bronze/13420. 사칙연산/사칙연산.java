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
		long X, Y, Z, res;
		char sign;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			X = Long.parseLong(st.nextToken());
			sign = st.nextToken().charAt(0);
			Y = Long.parseLong(st.nextToken());
			st.nextToken();
			Z = Long.parseLong(st.nextToken());
			if (sign == '+')
				res = X + Y;
			else if (sign == '-')
				res = X - Y;
			else if (sign == '*')
				res = X * Y;
			else
				res = X / Y;
			sb.append(res == Z ? "correct\n" : "wrong answer\n");
		}
		System.out.print(sb);
	}
}