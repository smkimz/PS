import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), k, df;
		int[] a = new int[2], b = new int[] { 3600, 60, 1 };
		StringTokenizer st;
		String[] t;
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i <= 1; i++) {
				t = st.nextToken().split(":");
				a[i] = 0;
				for (int j = 0; j < 3; j++)
					a[i] += Integer.parseInt(t[j]) * b[j];
			}
			k = Integer.parseInt(st.nextToken()) * 60;
			if (a[0] >= a[1])
				a[1] += 86400;
			df = a[1] - a[0];
			if (df >= k)
				sb.append("Perfect\n");
			else if (df + 3600 >= k)
				sb.append("Test\n");
			else
				sb.append("Fail\n");
		}
		System.out.print(sb);
	}
}