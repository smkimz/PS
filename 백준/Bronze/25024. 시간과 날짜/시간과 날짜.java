import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()), x, y;
		int[] days = new int[] { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		while (--N >= 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			if (x >= 0 && x <= 23 && y >= 0 && y <= 59)
				sb.append("Yes ");
			else
				sb.append("No ");
			if (x >= 1 && x <= 12 && y >= 1 && y <= days[x])
				sb.append("Yes\n");
			else
				sb.append("No\n");
		}
		System.out.print(sb);
	}
}