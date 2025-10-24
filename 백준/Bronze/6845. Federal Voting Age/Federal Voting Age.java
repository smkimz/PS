import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), d;
		int[] A = new int[] { 365, 32, 1 };
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			d = 0;
			for (int i = 0; i < 3; i++)
				d += Integer.parseInt(st.nextToken()) * A[i];
			if (d <= 726076)
				sb.append("Yes\n");
			else
				sb.append("No\n");
		}
		System.out.print(sb);
	}
}
