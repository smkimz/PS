import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x, y, z, p, n, m;
		char a, b;
		x = Integer.parseInt(st.nextToken());
		a = st.nextToken().charAt(0);
		y = Integer.parseInt(st.nextToken());
		b = st.nextToken().charAt(0);
		z = Integer.parseInt(st.nextToken());
		p = calc(x, y, a);
		n = calc(p, z, b);
		p = calc(y, z, b);
		m = calc(x, p, a);
		System.out.printf("%d\n%d", Math.min(n, m), Math.max(n, m));
	}

	static int calc(int x, int y, char a) {
		if (a == '+')
			return x + y;
		else if (a == '-')
			return x - y;
		else if (a == '*')
			return x * y;
		else if (a == '/')
			return x / y;
		return 0;
	}
}