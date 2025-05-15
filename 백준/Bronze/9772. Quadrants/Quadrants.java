import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		double x, y;
		while (true) {
			st = new StringTokenizer(br.readLine());
			x = Double.parseDouble(st.nextToken());
			y = Double.parseDouble(st.nextToken());
			if (x > 0 && y > 0)
				sb.append("Q1\n");
			else if (x < 0 && y > 0)
				sb.append("Q2\n");
			else if (x < 0 && y < 0)
				sb.append("Q3\n");
			else if (x > 0 && y < 0)
				sb.append("Q4\n");
			else
				sb.append("AXIS\n");
			if (x == 0 && y == 0)
				break;
		}
		System.out.println(sb);
	}
}