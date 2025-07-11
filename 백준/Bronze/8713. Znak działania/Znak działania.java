import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), max, cnt = 0;
		int[] res = new int[3];
		res[0] = a + b;
		res[1] = a - b;
		res[2] = a * b;
		max = Math.max(res[0], Math.max(res[1], res[2]));
		for (int i = 0; i < 3; i++) {
			if (res[i] == max)
				++cnt;
		}
		if (cnt >= 2) {
			System.out.println("NIE");
			return;
		}
		String A = (a < 0) ? "(" + a + ")" : Integer.toString(a), B = (b < 0) ? "(" + b + ")" : Integer.toString(b),
				R = (max < 0) ? "(" + max + ")" : Integer.toString(max);
		if (res[0] == max)
			System.out.println(A + "+" + B + "=" + R);
		else if (res[1] == max)
			System.out.println(A + "-" + B + "=" + R);
		else
			System.out.println(A + "*" + B + "=" + R);
	}
}